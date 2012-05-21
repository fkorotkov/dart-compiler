package org.dartlang.ast;

import org.dartlang.compile.Flow;
import org.dartlang.compile.Type;

/**
 * @author fedor.korotkov
 */
public class IntegerValueNode extends ExpressionNode {
    final int value;

    public IntegerValueNode(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String getText() {
        return super.getText() + "(" + value + ")";
    }

    @Override
    public Type getType(Flow currentFlow) {
        return Type.INT;
    }
}
