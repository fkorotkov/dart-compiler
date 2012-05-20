package org.dartlang.ast;

import org.dartlang.compile.Operator;

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

    public ExpressionNode getLeft(){
        return (ExpressionNode) getChildren().get(0);
    }

    public ExpressionNode getRight(){
        return (ExpressionNode) getChildren().get(1);
    }
}
