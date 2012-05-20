package org.dartlang.ast;

import org.dartlang.compile.Operator;

/**
 * @author fedor.korotkov
 */
public class EqualityExpression extends BinaryExpressionNode {
    public EqualityExpression(Operator operator, ExpressionNode left, ExpressionNode right) {
        super(operator, left, right);
    }
}
