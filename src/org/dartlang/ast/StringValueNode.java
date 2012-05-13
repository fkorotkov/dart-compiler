package org.dartlang.ast;

/**
 * @author fedor.korotkov
 */
public class StringValueNode extends ExpressionNode {
    private final String value;

    public StringValueNode(String text) {
        value = text;
    }

    @Override
    public String getText() {
        return super.getText() + "(" + value + ")";
    }
}
