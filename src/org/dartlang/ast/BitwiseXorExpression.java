package org.dartlang.ast;

/**
 * @author fedor.korotkov
 */
public class BitwiseXorExpression extends BinaryExpressionNode {
    public BitwiseXorExpression(ExpressionNode left, ExpressionNode right) {
        super(left, right);
    }
}
