package org.dartlang.ast;

import java.util.Collections;

/**
 * @author fedor.korotkov
 */
public class TypeNode extends ASTNode {
    private final String typeName;

    public TypeNode(String text) {
        super(Collections.<ASTNode>emptyList());
        typeName = text;
    }

    @Override
    public String getText() {
        return super.getText() + "(" + typeName + ")";
    }
}
