package org.dartlang.compile;

import org.dartlang.ast.*;

import java.io.PrintWriter;

/**
 * @author fedor.korotkov
 */
public class ExpressionASMEvaluator {
    /**
     * Result in eax
     */
    public static void calculateExpression(TemporaryVariableManager variableManager,
                                           Flow flow,
                                           PrintWriter out,
                                           ASTNode expression) {
        calculateExpression(variableManager, flow, out, expression, "eax");
    }

    private static void calculateExpression(TemporaryVariableManager variableManager,
                                            Flow flow,
                                            PrintWriter out,
                                            ASTNode expression,
                                            String registerName) {
        if (expression instanceof BinaryExpressionNode) {
            calculateBinaryExpression(variableManager, flow, out, (BinaryExpressionNode) expression, registerName);
        } else if (expression instanceof IntegerValueNode) {
            out.println("\t\tmov " + registerName + ", " + ((IntegerValueNode) expression).getValue());
        } else if (expression instanceof StringValueNode) {
            String literalName = StringPool.getLiteralName(((StringValueNode) expression).getValue());
            out.println("\t\tmov " + registerName + ", dword " + literalName);
        } else if (expression instanceof IdentifierNode) {
            final String varName = ((IdentifierNode) expression).getValue();
            out.println("\t\tmov " + registerName + ", dword [" + flow.getVar(varName).getName() + "]");
        }
    }

    private static void calculateBinaryExpression(TemporaryVariableManager variableManager,
                                                  Flow flow,
                                                  PrintWriter out,
                                                  BinaryExpressionNode expression,
                                                  String registerName) {
        calculateExpression(variableManager, flow, out, expression.getRight(), registerName);
        final TemporaryVariableManager.Variable rightVar = variableManager.hold(expression.getRight().getType(flow));
        ASMGenerator.saveVar(out, rightVar);

        calculateExpression(variableManager, flow, out, expression.getLeft());

        if (expression.getType(flow) == Type.STRING) {
            assert expression.getOperator() == Operator.PLUS;
            final TemporaryVariableManager.Variable leftVar = variableManager.hold(expression.getLeft().getType(flow));
            ASMGenerator.saveVar(out, leftVar);
            builtinToString(out, leftVar);
            builtinToString(out, rightVar);
            contatinateStrings(out, leftVar, rightVar);
            variableManager.release(leftVar);
        } else {
            applyBinaryOperation(out, expression, rightVar);
        }

        variableManager.release(rightVar);
        if (!"eax".equals(registerName)) {
            out.println("\t\tmov " + registerName + ", eax");
        }
    }

    private static void builtinToString(PrintWriter out, TemporaryVariableManager.Variable variable) {
        if (variable.getType() == Type.STRING) {
            return;
        }
        out.println("\t; toString(" + variable.getName() + ")");

        out.println("\t; creating buffer");
        out.println("\t\tpush dword [" + variable.getName() + "]");
        out.println("\t\tpush  ebp ; setup the frame");
        out.println("\t\tmov  ebp, esp");

        out.println("\t\tpush " + ASMGenerator.int2stringBuffer.getName());

        out.println("\t\tcall _strdup");

        out.println("\t\tmov  esp, ebp");

        out.println("\t; sprintf");
        out.println("\t;align 2*4. ");
        out.println("\t\tpush dword [" + variable.getName() + "]");
        out.println("\t\tpush dword [" + variable.getName() + "]");

        out.println("\t\tpush dword [" + variable.getName() + "]");
        out.println("\t\tpush " + ASMGenerator.formatInt.getName());

        out.println("\t\tmov dword [" + variable.getName() + "], eax ; save");
        out.println("\t\tpush eax");

        out.println("\t\tcall _sprintf");
        out.println("\t\tmov  esp, ebp");
        out.println("\t\tpop  ebp");
        out.println("\t\tpop  eax ; save int value");

        variable.setType(Type.STRING);
        out.println("\t; move pointer");
        out.println("\t\tpush ebx");
        out.println("\t\tpush ecx");

        out.println("\t\tmov ecx, 10");
        out.println("\t\tmov ebx, 0");

        final int id = ASMGenerator.getUniqueUID();
        out.println("\t; check less 0");
        out.println("\t\tcmp eax, 0");
        out.println("\t\tjge ll_" + id);
        out.println("\t\tsub ebx, eax");
        out.println("\t\tmov eax, ebx");
        out.println("\t\tmov ebx, 1");

        out.println("\tll_" + id + ":");
        out.println("\t\tmov edx, 0");
        out.println("\t\tdiv ecx");
        out.println("\t\tinc ebx");
        out.println("\t\tcmp eax, 0");
        out.println("\t\tjne ll_" + id);

        out.println("\t\tmov eax, dword [" + variable.getName() + "]");
        out.println("\t\tadd eax, " + ASMGenerator.int2stringBufferLength);
        out.println("\t\tsub eax, ebx");

        out.println("\t\tmov dword [" + variable.getName() + "], eax ; save");
        out.println("\t\tpop  ecx");
        out.println("\t\tpop  ebx");
    }

    private static void contatinateStrings(PrintWriter out,
                                           TemporaryVariableManager.Variable leftVar,
                                           TemporaryVariableManager.Variable rightVar) {
        out.println("\t; concatinate two strings: " + leftVar.getName() + " + " + rightVar.getName());

        out.println("\t; copy string: " + leftVar.getName());

        varToString(out, leftVar, "eax");

        out.println("\t\tpush  ebp ; setup the frame");
        out.println("\t\tmov  ebp, esp");

        out.println("\t\tpush eax");
        out.println("\t\tpush eax");

        out.println("\t\tcall _strdup");

        out.println("\t\tmov  esp, ebp");
        out.println("\t\tpop  ebp");

        varToString(out, rightVar, "ebx");
        out.println("\t\tpush  ebp ; setup the frame");
        out.println("\t\tmov  ebp, esp");

        out.println("\t\tpush ebx");
        out.println("\t\tpush eax");
        out.println("\t\tcall _strcat");

        out.println("\t\tmov  esp, ebp");
        out.println("\t\tpop  ebp");
    }

    private static void varToString(PrintWriter out, TemporaryVariableManager.Variable variable, String registerName) {
        if (variable.getType() == Type.STRING) {
            out.println("\t\tmov " + registerName + ", dword [" + variable.getName() + "]");
        } else {
            //todo: itoa
        }
    }

    /**
     * leftVar in eax.
     */
    private static void applyBinaryOperation(PrintWriter out,
                                             BinaryExpressionNode expression,
                                             TemporaryVariableManager.Variable rightVar) {
        final String opcode = expression.getOperator().getOpcode();
        switch (expression.getOperator()) {
            case PLUS:
            case MINUS:
                out.println("\t\t" + opcode + " eax, " + " dword [" + rightVar.getName() + "]");
                break;
            case MULTIPLY:
            case DIVIDE:
                out.println("\t\tmov ebx, " + " dword [" + rightVar.getName() + "]");
                out.println("\t\t" + opcode + " ebx");
                break;
        }
        // todo: other
    }
}
