package org.dartlang.ast;

/**
 * @author fedor.korotkov
 */
public class LogicalOrExpression extends BinaryExpressionNode {
    public LogicalOrExpression(ExpressionNode left, ExpressionNode right) {
        super(left, right);
    }
}
