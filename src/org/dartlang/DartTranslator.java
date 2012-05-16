package org.dartlang;

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.dartlang.compile.Translator;
import org.dartlang.util.FileUtil;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author fedor.korotkov
 */
public class DartTranslator {
    public static void main(String... args) throws IOException, RecognitionException {
        translate(new File(args[0]));
    }

    public static void translate(File file) throws IOException, RecognitionException {
        final ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(file));
        final DartLexer lexer = new DartLexer(input);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final DartParser parser = new DartParser(tokens);

        if (parser.failed()) {
            System.err.println("Parsing error!");
            return;
        }

        final Translator translator = new Translator(parser.topLevel().root);
        final File asmFile = new File(file.getParent(), FileUtil.getFileNameWithoutExtension(file.getName()) + ".asm");
        final PrintWriter out = new PrintWriter(asmFile);
        translator.translate(out);
        out.close();

    }
}
