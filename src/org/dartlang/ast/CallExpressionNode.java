package org.dartlang.ast;

import org.dartlang.compile.Flow;
import org.dartlang.compile.Type;
import org.dartlang.util.Processor;
import org.dartlang.util.ResolveUtil;
import org.dartlang.util.Wrapper;

import java.util.List;

/**
 * @author fedor.korotkov
 */
public class CallExpressionNode extends ExpressionNode {
    private String functionName;

    public CallExpressionNode(String text, List<ExpressionNode> parameters) {
        super(parameters);
        functionName = text;
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<? extends ASTNode> getParameters() {
        return children;
    }

    @Override
    public String getText() {
        return super.getText() + "(" + functionName + ")";
    }

    @Override
    public Type getType(Flow currentFlow) {
        final Wrapper<FunctionDeclarationNode> functionDeclarationNodeWrapper = new Wrapper<FunctionDeclarationNode>();
        ResolveUtil.treeWalkUp(this, new Processor<ASTNode>() {
            @Override
            public boolean process(ASTNode value) {
                functionDeclarationNodeWrapper.setValue(ResolveUtil.findFunctionDeclaration(getFunctionName(), value.getChildren()));
                return functionDeclarationNodeWrapper.getValue() == null;
            }
        });
        assert functionDeclarationNodeWrapper.getValue() != null : "can't find function " + getFunctionName();
        return functionDeclarationNodeWrapper.getValue().getTypeNode().getType();
    }
}
