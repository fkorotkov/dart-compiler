package org.dartlang.util;

import org.dartlang.ast.ASTNode;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Arrays;

/**
 * @author fedor.korotkov
 */
public class DebugUtil {
    public static void printTree(ASTNode root, Writer out) throws IOException {
        printTree(root, out, 0);
    }

    private static void printTree(ASTNode root, Writer out, int shift) throws IOException {
        out.write(tabs(shift) + root.getText());
        out.write('\n');
        for (ASTNode child : root.getChildren()) {
            printTree(child, out, shift + 1);
        }
    }

    private static String tabs(int shift) {
        char[] tabs = new char[shift];
        Arrays.fill(tabs, '\t');
        return new String(tabs);
    }
}
