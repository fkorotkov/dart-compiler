package org.dartlang.util;

/**
 * @author fedor.korotkov
 */
public interface Condition<T> {
    boolean value(T item);
}
