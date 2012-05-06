package org.dartlang.ast;

/**
 * @author fedor.korotkov
 */
public class VarDeclarationNode extends ASTNode {
    private final String name;
    private final ASTNode expression;

    public VarDeclarationNode(String name, ASTNode expression) {
        super(expression);
        this.name = name;
        this.expression = expression;
    }

    @Override
    public String getText() {
        return name + " = " + super.getText();
    }
}
