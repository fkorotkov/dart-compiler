package org.dartlang.ast;

/**
 * @author fedor.korotkov
 */
public class MultiplicativeExpression extends BinaryExpressionNode {
    public MultiplicativeExpression(ExpressionNode left, ExpressionNode right) {
        super(left, right);
    }
}
