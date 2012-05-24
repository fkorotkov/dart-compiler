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
        out.println("\tafter:");

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
