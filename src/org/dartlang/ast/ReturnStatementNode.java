package org.dartlang.ast;

/**
 * @author fedor.korotkov
 */
public class ReturnStatementNode extends ASTNode {
    public ReturnStatementNode(ASTNode child) {
        super(child);
    }

    public ExpressionNode getExpression(){
        return (ExpressionNode) children.get(0);
    }
}
