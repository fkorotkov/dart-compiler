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
        if(expression instanceof BinaryExpressionNode) {
            calculateBinaryExpression(variableManager, flow, out, (BinaryExpressionNode) expression, registerName);
        } else if(expression instanceof IntegerValueNode) {
            out.println("\t\tmov " + registerName + ", " + ((IntegerValueNode) expression).getValue());
        } if(expression instanceof IdentifierNode) {
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
        final TemporaryVariableManager.Variable rightVar = variableManager.hold();
        ASMGenerator.saveVar(out, rightVar);

        calculateExpression(variableManager, flow, out, expression.getLeft());

        applyBinaryOperation(out, expression, rightVar);
        variableManager.release(rightVar);

        if(!"eax".equals(registerName)) {
            out.println("\t\tmov " + registerName + ", eax");
        }
    }

    /**
     * leftVar in eax.
     */
    private static void applyBinaryOperation(PrintWriter out,
                                             BinaryExpressionNode expression,
                                             TemporaryVariableManager.Variable rightVar) {
        if(expression instanceof AdditiveExpression) {
            out.println("\t\tadd eax, " + " dword [" + rightVar.getName() + "]");
        } else if(expression instanceof MultiplicativeExpression) {
            out.println("\t\tmov ebx, " + " dword [" + rightVar.getName() + "]");
            out.println("\t\tmul ebx");
        }
        // todo: other
    }
}
