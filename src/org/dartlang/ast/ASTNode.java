package org.dartlang.ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author fedor.korotkov
 */
public class ASTNode {
    private final String text;
    protected final List<ASTNode> children;

    public ASTNode(String text) {
        this(text, new ArrayList<ASTNode>());
    }

    public ASTNode(String text, List<ASTNode> children) {
        this.text = text;
        this.children = children;
    }

    public ASTNode(List<ASTNode> children) {
        this(null, children);
    }

    public ASTNode(ASTNode child) {
        this(child.getText(), Arrays.asList(child));
    }

    public String getText() {
        return text == null ? getClass().getSimpleName() : text;
    }

    public List<ASTNode> getChildren() {
        return children;
    }
}
