package org.dartlang.ast;

import org.dartlang.compile.Flow;
import org.dartlang.compile.Type;

/**
 * @author fedor.korotkov
 */
public class StringValueNode extends ExpressionNode {
    private final String value;

    public StringValueNode(String text) {
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
        return Type.STRING;
    }
}
