package org.dartlang.util;

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
}
