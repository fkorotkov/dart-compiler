package org.dartlang.parsing;

import junit.framework.TestCase;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.dartlang.DartLexer;
import org.dartlang.DartParser;
import org.dartlang.util.DebugUtil;
import org.dartlang.util.FileUtil;

import java.io.*;

/**
 * @author fedor.korotkov
 */
public class ParserTestCase extends TestCase {

    protected String getDataPath() {
        return "testData" + File.separator + "parser";
    }

    protected String getTestFilePath() {
        return getDataPath() + File.separator + getTestName() + ".dart";
    }

    protected String getExpectedFilePath() {
        return getDataPath() + File.separator + getTestName() + ".txt";
    }

    public String getTestName() {
        final String name = getName();
        return name.startsWith("test") ? name.substring("test".length()) : name;
    }

    public void doTest() throws IOException, RecognitionException {
        final ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(getTestFilePath()));
        final DartLexer lexer = new DartLexer(input);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final DartParser parser = new DartParser(tokens);

        final StringWriter actualOut = new StringWriter();
        DebugUtil.printTree(parser.topLevel().root, actualOut);
        actualOut.close();

        final File expectedOutFile = new File(getExpectedFilePath());

        if (!expectedOutFile.exists()) {
            final PrintWriter out = new PrintWriter(expectedOutFile);
            out.print(actualOut.toString());
            out.close();
            assertTrue("Expected file not found. Create new at " + getExpectedFilePath(), false);
        }

        assertEquals(FileUtil.getFileContent(expectedOutFile), actualOut.toString());
    }

    public void testSimple() throws Throwable {
        doTest();
    }

    public void testExpressions() throws Throwable {
        doTest();
    }

    public void testCall() throws Throwable {
        doTest();
    }
}
