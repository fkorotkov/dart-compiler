package org.dartlang;

import org.dartlang.util.DebugUtil;
import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author fedor.korotkov
 */
public class Main {
    public static void main(String[] args) throws IOException, RecognitionException {
        final ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[0]));
        final DartLexer lexer = new DartLexer(input);
        final CommonTokenStream tokens = new CommonTokenStream(lexer);
        final DartParser parser = new DartParser(tokens);

        final PrintWriter out = new PrintWriter(System.out);
        DebugUtil.printTree(parser.topLevel().root, out);
        out.close();
    }
}
