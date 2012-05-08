package org.dartlang.ast;

/**
 * @author fedor.korotkov
 */
public class LogicalAndExpression extends BinaryExpressionNode {
    public LogicalAndExpression(ExpressionNode left, ExpressionNode right) {
        super(left, right);
    }
}
