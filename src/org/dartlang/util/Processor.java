package org.dartlang.util;

public interface Processor<T> {
    /**
     * @param value to process
     * @return false to stop
     */
    boolean process(T value);
}
