package org.dartlang.ast;

import java.util.Arrays;

/**
 * @author fedor.korotkov
 */
public class FunctionDeclarationNode extends ASTNode {
    private final String name;
    private final ParameterListNode parameterListNode;
    private final TypeNode typeNode;
    private final StatementsNode statementsNode;

    public FunctionDeclarationNode(String name, ParameterListNode parameterListNode, TypeNode typeNode, StatementsNode statementsNode) {
        super(Arrays.<ASTNode>asList(typeNode, parameterListNode, statementsNode));
        this.name = name;
        this.parameterListNode = parameterListNode;
        this.typeNode = typeNode;
        this.statementsNode = statementsNode;
    }

    public StatementsNode getStatementsNode() {
        return statementsNode;
    }

    @Override
    public String getText() {
        return super.getText() + "(" + name + ")";
    }
}
