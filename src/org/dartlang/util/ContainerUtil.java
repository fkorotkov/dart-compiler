package org.dartlang.util;

import org.dartlang.ast.ASTNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author fedor.korotkov
 */
public class ContainerUtil {
    public static <T> List<? extends T> filter(List<? extends T> collection, Condition<T> condition) {
        final List<T> result = new ArrayList<T>();
        for (T item : collection) {
            if (condition.value(item)) {
                result.add(item);
            }
        }
        return result;
    }
    public static <T> T find(List<? extends T> collection, Condition<T> condition) {
        for (T item : collection) {
            if (condition.value(item)) {
                return item;
            }
        }
        return null;
    }
}
