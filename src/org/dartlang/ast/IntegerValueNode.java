package org.dartlang.ast;

/**
 * @author fedor.korotkov
 */
public class IntegerValueNode extends ExpressionNode {
    final int value;

    public IntegerValueNode(int value) {
        super(Integer.toString(value));
        this.value = value;
    }
}
