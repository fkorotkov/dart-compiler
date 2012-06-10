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
        ASMGenerator.dataBlock(out, variableManager.getCount());
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
        variableManager.release(flow.resetTo(oldFlow));
    }

    private void translateFunctionDeclaration(PrintWriter out, FunctionDeclarationNode node, Flow flow) {
        final Flow oldFlow = new Flow(flow);
        out.println("_" + node.getName() + ":");
        List<? extends ASTNode> children = node.getParameterListNode().getChildren();
        for (int i = 0, childrenSize = children.size(); i < childrenSize; i++) {
            ASTNode item = children.get(i);
            final ParameterNode parameter = (ParameterNode) item;
            final Type type = Type.valueOf(parameter.getTypeNode().getTypeName());
            TemporaryVariableManager.Variable variable = variableManager.hold(type);
            flow.addVar(parameter.getName(), variable);
            final String reg = "e" + ((char) ('a' + i)) + "x";
            out.println("\t\tmov dword [" + variable.getName() + "], " + reg + " ; " + parameter.getName() + ":" + type.toString());
        }
        out.println("\t; end with parameters for " + node.getName());
        translate(out, node.getStatementsNode().getChildren(), flow);
        out.println("\t\tret");
        variableManager.release(flow.resetTo(oldFlow));
    }

    private void translateVarDeclaration(PrintWriter out, VarDeclarationNode node, Flow flow) {
        out.println("\t; " + node.getText());
        final ASTNode expression = node.getExpression();
        Type type = expression instanceof ExpressionNode ? ((ExpressionNode) expression).getType(flow) : Type.INT;
        TemporaryVariableManager.Variable variable = variableManager.hold(type);
        flow.addVar(node.getName(), variable);
        out.println("\t; " + node.getName() + " is in " + variable.getName() + " with type " + type.toString());
        out.println("\t; start calculating expression for " + node.getName());
        ExpressionASMEvaluator.calculateExpression(variableManager, flow, out, expression);
        ASMGenerator.saveVar(out, variable);
        out.println("\t; end calculating expression for " + node.getName());
    }

    private void translateCallExpression(PrintWriter out, CallExpressionNode callExpressionNode, Flow flow) {
        if ("print".equals(callExpressionNode.getFunctionName())) {
            final ASTNode expression = callExpressionNode.getParameters().iterator().next();
            if (expression instanceof IdentifierNode) {
                ASMGenerator.callPrintf(out, flow.getVar(((IdentifierNode) expression).getValue()));
            } else if (expression instanceof ExpressionNode) {
                TemporaryVariableManager.Variable variable = variableManager.hold(((ExpressionNode) expression).getType(flow));
                ExpressionASMEvaluator.calculateExpression(variableManager, flow, out, expression);
                ASMGenerator.saveVar(out, variable);
                ASMGenerator.callPrintf(out, variable);
                variableManager.release(variable);
            }
            return;
        }
        List<? extends ASTNode> parameters = callExpressionNode.getParameters();
        for (int i = 0; i < parameters.size(); ++i) {
            final ASTNode parameter = parameters.get(i);
            out.println("\t; parameter " + parameter.getText());
            if (parameter instanceof IdentifierNode) {
                out.println("\t\tpush dword [" + flow.getVar(((IdentifierNode) parameter).getValue()) + "]");
            } else if (parameter instanceof ExpressionNode) {
                ExpressionASMEvaluator.calculateExpression(variableManager, flow, out, parameter);
                out.println("\t\tpush eax");
            }
        }
        for (int i = 0; i < parameters.size(); ++i) {
            final String reg = "e" + ((char) ('a' + i)) + "x";
            out.println("\t\tpop " + reg);
        }
        out.println("\t; align");
        out.println("\t\tpush ebx");
        out.println("\t\tpush ecx");
        out.println("\t\tpush edx");
        out.println("\t\tcall _" + callExpressionNode.getFunctionName());
        out.println("\t\tpop edx");
        out.println("\t\tpop ecx");
        out.println("\t\tpop ebx");
    }
}
