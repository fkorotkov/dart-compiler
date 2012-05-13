package org.dartlang.ast;

/**
 * @author fedor.korotkov
 */
public class IntegerValueNode extends ExpressionNode {
    final int value;

    public IntegerValueNode(int value) {
        this.value = value;
    }

    @Override
    public String getText() {
        return super.getText() + "(" + value + ")";
    }
}
