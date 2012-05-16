package org.dartlang.ast;

/**
 * @author fedor.korotkov
 */
public class VarDeclarationNode extends ASTNode {
    private final String name;
    private final TypeNode type;
    private final ASTNode expression;

    public VarDeclarationNode(String name, TypeNode type, ASTNode expression) {
        super(expression);
        this.name = name;
        this.type = type;
        this.expression = ((VarInitNode) expression).getExpression();
    }

    public String getName() {
        return name;
    }

    public ASTNode getExpression() {
        return expression;
    }

    @Override
    public String getText() {
        return super.getText() + "(" + name + ")";
    }
}
