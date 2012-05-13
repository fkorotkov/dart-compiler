package org.dartlang.ast;

import java.util.List;

/**
 * @author fedor.korotkov
 */
public class CallExpressionNode extends ExpressionNode {
    private String functionName;

    public CallExpressionNode(String text, List<ExpressionNode> parameters) {
        super(parameters);
        functionName = text;
    }

    @Override
    public String getText() {
        return super.getText() + "(" + functionName + ")";
    }
}
