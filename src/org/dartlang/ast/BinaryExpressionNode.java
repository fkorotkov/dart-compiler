package org.dartlang.ast;

import java.util.Arrays;

/**
 * @author fedor.korotkov
 */
public class BinaryExpressionNode extends ExpressionNode {
    public BinaryExpressionNode(ExpressionNode left, ExpressionNode right) {
        super(Arrays.asList((ASTNode) left, (ASTNode) right));
    }
}
