package org.dartlang.ast;

import org.dartlang.compile.Operator;

/**
 * @author fedor.korotkov
 */
public class BitwiseAndExpression extends BinaryExpressionNode {
    public BitwiseAndExpression(Operator operator, ExpressionNode left, ExpressionNode right) {
        super(operator, left, right);
    }
}
