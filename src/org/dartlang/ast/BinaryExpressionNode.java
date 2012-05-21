package org.dartlang.ast;

import org.dartlang.compile.Flow;
import org.dartlang.compile.Operator;
import org.dartlang.compile.Type;

import java.util.Arrays;

/**
 * @author fedor.korotkov
 */
public abstract class BinaryExpressionNode extends ExpressionNode {
    private final Operator operator;

    public BinaryExpressionNode(Operator operator, ExpressionNode left, ExpressionNode right) {
        super(Arrays.asList(left, right));
        this.operator = operator;
    }

    public Operator getOperator() {
        return operator;
    }

    public ExpressionNode getLeft() {
        return (ExpressionNode) getChildren().get(0);
    }

    public ExpressionNode getRight() {
        return (ExpressionNode) getChildren().get(1);
    }

    @Override
    public Type getType(Flow currentFlow) {
        final Type l = getLeft().getType(currentFlow);
        final Type r = getRight().getType(currentFlow);
        return l == Type.INT && r == Type.INT ? Type.INT : Type.STRING;
    }
}
