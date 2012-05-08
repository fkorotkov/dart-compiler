package org.dartlang.ast;

/**
 * @author fedor.korotkov
 */
public class BitwiseOrExpression extends BinaryExpressionNode {
    public BitwiseOrExpression(ExpressionNode left, ExpressionNode right) {
        super(left, right);
    }
}
