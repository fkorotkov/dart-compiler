package org.dartlang.util;

import org.dartlang.ast.ASTNode;
import org.dartlang.ast.FunctionDeclarationNode;

import java.util.List;

public class ResolveUtil {
    public static void treeWalkUp(ASTNode node, Processor<ASTNode> processor) {
        ASTNode parent = node.getParent();
        while (parent != null) {
            if (!processor.process(parent)) {
                break;
            }
            parent = parent.getParent();
        }
    }

    public static FunctionDeclarationNode findFunctionDeclaration(final String name, List<? extends ASTNode> children) {
        final ASTNode result = ContainerUtil.find(children, new Condition<ASTNode>() {
            @Override
            public boolean value(ASTNode item) {
                return item instanceof FunctionDeclarationNode && name.equals(((FunctionDeclarationNode) item).getName());
            }
        });
        return result == null ? null : (FunctionDeclarationNode) result;
    }
}
