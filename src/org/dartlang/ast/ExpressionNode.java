package org.dartlang.ast;

import java.util.List;

/**
 * @author fedor.korotkov
 */
public class ExpressionNode extends ASTNode {
    public ExpressionNode(String text) {
        super(text);
    }

    public ExpressionNode(List<ASTNode> children) {
        super(children);
    }
}
