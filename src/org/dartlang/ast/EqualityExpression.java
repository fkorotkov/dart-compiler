package org.dartlang.ast;

/**
 * @author fedor.korotkov
 */
public class EqualityExpression extends BinaryExpressionNode {
    public EqualityExpression(ExpressionNode left, ExpressionNode right) {
        super(left, right);
    }
}
