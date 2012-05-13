package org.dartlang.ast;

/**
 * @author fedor.korotkov
 */
public class IdentifierNode extends ExpressionNode {
    private final String value;

    public IdentifierNode(String text) {
        value = text;
    }



    @Override
    public String getText() {
        return super.getText() + "(" + value + ")";
    }
}
