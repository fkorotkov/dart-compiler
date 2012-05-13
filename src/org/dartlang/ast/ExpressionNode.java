package org.dartlang.ast;

import java.util.Collections;
import java.util.List;

/**
 * @author fedor.korotkov
 */
public class ExpressionNode extends ASTNode {
    public ExpressionNode() {
        super(Collections.<ASTNode>emptyList());
    }

    public ExpressionNode(List<? extends ASTNode> children) {
        super(children);
    }
}
