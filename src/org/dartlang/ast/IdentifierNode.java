package org.dartlang.ast;

import org.dartlang.compile.Flow;
import org.dartlang.compile.TemporaryVariableManager;
import org.dartlang.compile.Type;

/**
 * @author fedor.korotkov
 */
public class IdentifierNode extends ExpressionNode {
    private final String value;

    public IdentifierNode(String text) {
        value = text;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String getText() {
        return super.getText() + "(" + value + ")";
    }

    @Override
    public Type getType(Flow currentFlow) {
        final TemporaryVariableManager.Variable variable = currentFlow.getVar(getValue());
        assert variable != null : "Unknown variable " + getValue();
        return variable.getType();
    }
}
