package org.dartlang.ast;

/**
 * @author fedor.korotkov
 */
public class BitwiseAndExpression extends BinaryExpressionNode {
    public BitwiseAndExpression(ExpressionNode left, ExpressionNode right) {
        super(left, right);
    }
}
