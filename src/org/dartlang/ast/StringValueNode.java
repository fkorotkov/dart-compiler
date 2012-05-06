package org.dartlang.ast;

/**
 * @author fedor.korotkov
 */
public class StringValueNode extends ExpressionNode {
    public StringValueNode(String text) {
        super(text);
    }
}
