package org.dartlang.ast;

/**
 * @author fedor.korotkov
 */
public class ParameterNode extends ASTNode {
    private final TypeNode typeNode;
    private final String name;

    public ParameterNode(TypeNode typeNode, String name) {
        super(typeNode);
        this.typeNode = typeNode;
        this.name = name;
    }

    @Override
    public String getText() {
        return super.getText() + " " + name;
    }
}
