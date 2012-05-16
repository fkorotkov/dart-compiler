package org.dartlang.parsing;

import junit.framework.TestCase;
import org.dartlang.DartTranslator;
import org.dartlang.util.FileUtil;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CompilerTestCase extends TestCase {
    protected String getDataPath() {
        return "testData" + File.separator + "compiler";
    }

    protected String[] getenv() {
        final List<String> result = new ArrayList<String>();
        for (Map.Entry<String, String> var : System.getenv().entrySet()) {
            result.add(var.getKey() + "=" + var.getValue());
        }
        return result.toArray(new String[result.size()]);
    }

    public String getTestName() {
        final String name = getName();
        return name.startsWith("test") ? name.substring("test".length()) : name;
    }

    @Override
    protected void tearDown() throws Exception {
        new File(getDataPath(), getTestName() + ".asm").delete();
        new File(getDataPath(), getTestName() + ".o").delete();
        new File(getDataPath(), getTestName()).delete();
    }

    public void doTest() throws Throwable {
        DartTranslator.translate(new File(getDataPath(), getTestName() + ".dart"));
        doCompile();
        doLinking();
        final StringBuilder stdout = runCommandAndGetOutput(new String[]{"./" + getTestName()}, false);
        assertEquals(
                FileUtil.getFileContent(new File(getDataPath(), getTestName() + ".out")).trim(),
                stdout.toString().trim()
        );
    }

    private void doCompile() throws IOException, InterruptedException {
        final String[] cmdarray = {"nasm", "-f", "macho", getTestName() + ".asm"};
        runCommand(cmdarray, "compilation error:\n", new File(getDataPath(), getTestName() + ".o"));
    }

    private void doLinking() throws IOException, InterruptedException {
        final String[] cmdarray = {"gcc", "-m32", "-Wl", getTestName() + ".o", "-o", getTestName()};
        runCommand(cmdarray, "linking error:\n", new File(getDataPath(), getTestName()));
    }

    private void runCommand(String[] cmdarray, String errorMessage, File expectedOutput) throws IOException, InterruptedException {
        final StringBuilder stdout = runCommandAndGetOutput(cmdarray, true);
        assertTrue(errorMessage + stdout.toString(), expectedOutput.exists());
    }

    private StringBuilder runCommandAndGetOutput(String[] cmdarray, boolean isStdErr) throws IOException, InterruptedException {
        Process p = Runtime.getRuntime().exec(
                cmdarray,
                getenv(),
                new File(getDataPath())
        );
        p.waitFor();
        final InputStream stream = isStdErr ? p.getErrorStream() : p.getInputStream();
        final BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
        final StringBuilder out = new StringBuilder();
        String line = reader.readLine();
        while (line != null) {
            out.append(line).append("\n");
            line = reader.readLine();
        }
        return out;
    }

    public void testSimple() throws Throwable {
        doTest();
    }
}
