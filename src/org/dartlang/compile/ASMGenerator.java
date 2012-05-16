package org.dartlang.compile;

import org.dartlang.ast.IntegerValueNode;

import java.io.PrintWriter;
import java.util.Collection;

public class ASMGenerator {
    private static TemporaryVariableManager.Variable formatInt = new TemporaryVariableManager.Variable("format_int");

    public static void header(PrintWriter out) {
        out.println("extern _printf");
        out.println("segment .text");
        out.println("global _main");
    }

    public static void dataBlock(PrintWriter out, Collection<TemporaryVariableManager.Variable> variables) {
        out.println("segment .data");
        for (TemporaryVariableManager.Variable variable : variables) {
            out.println("\t" + variable.getName() + " dq 0.0");
        }
        out.println("\t" + formatInt.getName() + " db \"%10d\", 0");
    }

    public static void callPrintf(PrintWriter out, TemporaryVariableManager.Variable variable) {
        callPrintf(out, variable, formatInt);
    }

    public static void callPrintf(PrintWriter out, TemporaryVariableManager.Variable... variables) {
        out.println("\t\tpush  ebp ; setup the frame");
        out.println("\t\tmov  ebp, esp");
        for (TemporaryVariableManager.Variable variable : variables) {
            // todo: hack
            if (variable == formatInt) {
                out.println("\t\tpush " + variable.getName());
            } else {
                out.println("\t\tpush dword [" + variable.getName() + "]");
            }
        }
        out.println("\t\tcall _printf");
        out.println("\t\tadd  esp, " + (4 * variables.length) + " ; cleanup the stack");
        out.println("\t\tmov  esp, ebp");
        out.println("\t\tpop  ebp");
    }

    public static void calculateExpression(TemporaryVariableManager variableManager, PrintWriter out, TemporaryVariableManager.Variable variable, IntegerValueNode valueNode) {
        out.println("\t\tmov dword [" + variable.getName() + "], " + valueNode.getValue());

    }
}
