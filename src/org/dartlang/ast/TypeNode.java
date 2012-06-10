package org.dartlang.ast;

import org.dartlang.compile.Type;

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

    public Type getType() {
        return Type.valueOf(getTypeName());
    }
    public String getTypeName() {
        return typeName.toUpperCase();
    }

    @Override
    public String getText() {
        return super.getText() + "(" + typeName + ")";
    }
}
