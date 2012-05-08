package org.dartlang.ast;

/**
 * @author fedor.korotkov
 */
public class AdditiveExpression extends BinaryExpressionNode {
    public AdditiveExpression(ExpressionNode left, ExpressionNode right) {
        super(left, right);
    }
}
