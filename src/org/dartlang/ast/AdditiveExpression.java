package org.dartlang.ast;

import org.dartlang.compile.Operator;

/**
 * @author fedor.korotkov
 */
public class AdditiveExpression extends BinaryExpressionNode {
    public AdditiveExpression(Operator operator, ExpressionNode left, ExpressionNode right) {
        super(operator, left, right);
    }
}
