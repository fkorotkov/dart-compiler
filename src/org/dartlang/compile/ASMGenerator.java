package org.dartlang.compile;

import java.io.PrintWriter;

public class ASMGenerator {
    public static TemporaryVariableManager.Variable formatInt = new TemporaryVariableManager.Variable("format_int",
            Type.STRING);
    public static TemporaryVariableManager.Variable formatString = new TemporaryVariableManager.Variable("format_str",
            Type.STRING);
    public static TemporaryVariableManager.Variable int2stringBuffer = new TemporaryVariableManager.Variable("int2string_buf",
            Type.STRING);

    public static void header(PrintWriter out) {
        out.println("extern _printf, _sprintf, _strcat, _strlen, _strdup, _itoa, _malloc");
        out.println("segment .text");
        out.println("global _main");
    }

    public static void dataBlock(PrintWriter out, int variableCount) {
        out.println("segment .data");
        for (int i = 0; i < variableCount; ++i) {
            out.println("\t tmp" + i + " dq 0.0");
        }
        out.println("\t" + formatInt.getName() + " db \"%10d\", 0");
        out.println("\t" + formatString.getName() + " db \"%s\", 0");
        out.println("\t" + int2stringBuffer.getName() + " db \"1234567890\", 0");
        StringPool.writeToDataBlock(out);
    }

    public static void callPrintf(PrintWriter out, TemporaryVariableManager.Variable variable) {
        if (variable.getType() == Type.INT) {
            callPrintfMany(out, variable, formatInt);
        } else {
            callPrintfMany(out, variable, formatString);
        }
    }

    public static void callPrintfMany(PrintWriter out, TemporaryVariableManager.Variable... variables) {
        out.print("\t; printf(");
        for (int i = variables.length - 1; i >= 0; --i) {
            if (i > 0) out.print(", ");
            out.print(variables[i].getType().toString().toLowerCase());
            out.print(" ");
            out.print(variables[i].getName());
        }
        out.println(")");
        out.println("\t\tpush  ebp ; setup the frame");
        out.println("\t\tmov  ebp, esp");
        for (TemporaryVariableManager.Variable variable : variables) {
            // todo: hack
            if (variable == formatInt || variable == formatString) {
                out.println("\t\tpush " + variable.getName());
            } else if (variable.getType() == Type.STRING) {
                out.println("\t\tpush dword [" + variable.getName() + "]");
            } else {
                out.println("\t\tpush dword [" + variable.getName() + "]");
            }
        }
        out.println("\t\tcall _printf");
        out.println("\t\tmov  esp, ebp");
        out.println("\t\tpop  ebp");
    }

    public static void saveVar(PrintWriter out, TemporaryVariableManager.Variable variable) {
        out.println("\t\tmov dword [" + variable.getName() + "], eax");
    }
}
