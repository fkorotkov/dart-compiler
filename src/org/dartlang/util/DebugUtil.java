package org.dartlang.util;

import org.dartlang.ast.ASTNode;

import java.io.PrintWriter;
import java.util.Arrays;

/**
 * @author fedor.korotkov
 */
public class DebugUtil {
    public static void printTree(ASTNode root, PrintWriter out) {
        printTree(root, out, 0);
    }

    private static void printTree(ASTNode root, PrintWriter out, int shift) {
        out.println(tabs(shift) + root.getText());
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
