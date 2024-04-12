package com.github.angel.generic;

public class Box<T> {
    private  T values;

    public Box(T values) {
        this.values = values;
    }

    public T getValues() {
        return values;
    }

    public void setValues(T values) {
        this.values = values;
    }
}
