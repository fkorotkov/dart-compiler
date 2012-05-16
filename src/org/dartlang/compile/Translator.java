package org.dartlang.compile;

import org.dartlang.ast.*;

import java.io.PrintWriter;
import java.util.List;

public class Translator {
    private final ASTNode root;
    private final TemporaryVariableManager variableManager = new TemporaryVariableManager();

    public Translator(ASTNode root) {
        this.root = root;
    }

    public void translate(PrintWriter out) {
        ASMGenerator.header(out);
        translate(out, root.getChildren(), new Flow());
        ASMGenerator.dataBlock(out, variableManager.getAllVariables());
    }

    private void translate(PrintWriter out, List<? extends ASTNode> nodes, Flow flow) {
        final Flow oldFlow = new Flow(flow);
        for (ASTNode node : nodes) {
            if (node instanceof FunctionDeclarationNode) {
                translateFunctionDeclaration(out, (FunctionDeclarationNode) node, flow);
            } else if (node instanceof VarDeclarationNode) {
                translateVarDeclaration(out, (VarDeclarationNode) node, flow);
            } else if (node instanceof CallExpressionNode) {
                translateCallExpression(out, (CallExpressionNode) node, flow);
            } else {
                System.err.println("Cannot translate node: " + node.getText());
            }
        }
        final List<TemporaryVariableManager.Variable> var2delete = flow.resetTo(oldFlow);
    }

    private void translateFunctionDeclaration(PrintWriter out, FunctionDeclarationNode node, Flow flow) {
        out.println("_" + node.getName() + ":");
        translate(out, node.getStatementsNode().getChildren(), flow);
        out.println("\t\tret");
    }

    private void translateVarDeclaration(PrintWriter out, VarDeclarationNode node, Flow flow) {
        TemporaryVariableManager.Variable variable = variableManager.hold();
        flow.addVar(node.getName(), variable);
        ASTNode expression = node.getExpression();
        if (expression instanceof IntegerValueNode) {
            ASMGenerator.calculateExpression(variableManager, out, variable, (IntegerValueNode) expression);
        } else {
            // todo
        }
    }

    private void translateCallExpression(PrintWriter out, CallExpressionNode callExpressionNode, Flow flow) {
        if (!"print".equals(callExpressionNode.getFunctionName())) {
            return;
        }

        final ASTNode expressionNode = callExpressionNode.getParameters().iterator().next();
        if (expressionNode instanceof IdentifierNode) {
            ASMGenerator.callPrintf(out, flow.getVar(((IdentifierNode) expressionNode).getValue()));
        } else {
            // todo
        }
    }
}