package org.dartlang.ast;

/**
 * @author fedor.korotkov
 */
public class VarInitNode extends ASTNode {
    private final ASTNode expression;

    public VarInitNode(ASTNode expression) {
        super(expression);
        this.expression = expression;
    }

    public ASTNode getExpression() {
        return expression;
    }
}
