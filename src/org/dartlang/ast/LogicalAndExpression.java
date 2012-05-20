package org.dartlang.ast;

import org.dartlang.compile.Operator;

/**
 * @author fedor.korotkov
 */
public class LogicalAndExpression extends BinaryExpressionNode {
    public LogicalAndExpression(Operator operator, ExpressionNode left, ExpressionNode right) {
        super(operator, left, right);
    }
}
