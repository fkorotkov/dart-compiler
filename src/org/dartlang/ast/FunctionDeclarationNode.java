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
        super(getText(name, parameterListNode, typeNode), Arrays.<ASTNode>asList(statementsNode));
        this.name = name;
        this.parameterListNode = parameterListNode;
        this.typeNode = typeNode;
        this.statementsNode = statementsNode;
    }

    private static String getText(String name, ParameterListNode parameterListNode, TypeNode typeNode) {
        final StringBuilder result = new StringBuilder();
        if(typeNode != null){
            result.append(typeNode.getText());
        }
        result.append(name).append("(");
        if(parameterListNode != null){
            result.append(parameterListNode.getText());
        }
        result.append(")");
        return result.toString();
    }
}
