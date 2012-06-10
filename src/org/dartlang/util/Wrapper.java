package org.dartlang.util;

public class Wrapper<T> {
    private T value;

    public Wrapper() {
    }

    public Wrapper(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
