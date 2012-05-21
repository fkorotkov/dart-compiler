package org.dartlang.ast;

import org.dartlang.compile.Flow;
import org.dartlang.compile.Type;

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

    public String getFunctionName() {
        return functionName;
    }

    public List<? extends ASTNode> getParameters() {
        return children;
    }

    @Override
    public String getText() {
        return super.getText() + "(" + functionName + ")";
    }

    @Override
    public Type getType(Flow currentFlow) {
        return null;
    }
}
