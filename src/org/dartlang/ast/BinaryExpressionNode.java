package org.dartlang.ast;

import java.util.Arrays;

/**
 * @author fedor.korotkov
 */
public abstract class BinaryExpressionNode extends ExpressionNode {
    public BinaryExpressionNode(ExpressionNode left, ExpressionNode right) {
        super(Arrays.asList(left, right));
    }

    public ExpressionNode getLeft(){
        return (ExpressionNode) getChildren().get(0);
    }

    public ExpressionNode getRight(){
        return (ExpressionNode) getChildren().get(1);
    }
}
