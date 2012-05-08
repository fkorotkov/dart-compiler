package org.dartlang.ast;

/**
 * @author fedor.korotkov
 */
public class VarDeclarationNode extends ASTNode {
    private final String name;
    private final TypeNode type;
    private final ASTNode expression;

    public VarDeclarationNode(String name, TypeNode type, ASTNode expression) {
        super(name);
        this.name = name;
        this.type = type;
        this.expression = expression;
    }

    @Override
    public String getText() {
        return name + " = " + super.getText();
    }
}
