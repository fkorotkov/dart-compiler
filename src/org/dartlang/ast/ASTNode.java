package org.dartlang.ast;

import org.dartlang.util.Condition;
import org.dartlang.util.ContainerUtil;

import java.util.Arrays;
import java.util.List;

/**
 * @author fedor.korotkov
 */
public class ASTNode {
    private ASTNode parent = null;
    protected final List<? extends ASTNode> children;

    public ASTNode(List<? extends ASTNode> children) {
        this.children = ContainerUtil.filter(children, new Condition<ASTNode>() {
            @Override
            public boolean value(ASTNode item) {
                return item != null;
            }
        });
        for (ASTNode child : getChildren()) {
            child.parent = this;
        }
    }

    public ASTNode getParent() {
        return parent;
    }

    public ASTNode(ASTNode child) {
        this(Arrays.asList(child));
    }

    public String getText() {
        return getClass().getSimpleName();
    }

    public List<? extends ASTNode> getChildren() {
        return children;
    }
}
