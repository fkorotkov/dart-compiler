package org.dartlang.ast;

import org.dartlang.compile.Operator;

/**
 * @author fedor.korotkov
 */
public class LogicalOrExpression extends BinaryExpressionNode {
    public LogicalOrExpression(Operator operator, ExpressionNode left, ExpressionNode right) {
        super(operator, left, right);
    }
}
