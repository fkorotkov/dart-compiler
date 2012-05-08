package org.dartlang.ast;

import java.util.List;

/**
 * @author fedor.korotkov
 */
public class CallExpressionNode extends ExpressionNode {
    private final List<ExpressionNode> parameters;

    public CallExpressionNode(String text, List<ExpressionNode> parameters) {
        super(text);
        this.parameters = parameters;
    }
}
