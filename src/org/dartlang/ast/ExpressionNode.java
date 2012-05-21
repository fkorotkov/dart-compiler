package org.dartlang.ast;

import org.dartlang.compile.Flow;
import org.dartlang.compile.Type;

import java.util.Collections;
import java.util.List;

/**
 * @author fedor.korotkov
 */
public abstract class ExpressionNode extends ASTNode {
    public ExpressionNode() {
        super(Collections.<ASTNode>emptyList());
    }

    public ExpressionNode(List<? extends ASTNode> children) {
        super(children);
    }

    abstract public Type getType(Flow currentFlow);
}
