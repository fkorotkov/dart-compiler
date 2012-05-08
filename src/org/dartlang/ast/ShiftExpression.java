package org.dartlang.ast;

/**
 * @author fedor.korotkov
 */
public class ShiftExpression extends BinaryExpressionNode {
    public ShiftExpression(ExpressionNode left, ExpressionNode right) {
        super(left, right);
    }
}
