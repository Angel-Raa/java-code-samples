package com.github.angel.generic;

public class Foo<T> {
    private T foo;

    public Foo(T foo) {
        this.foo = foo;
    }

    public T getFoo() {
        return foo;
    }

    public void setFoo(T foo) {
        this.foo = foo;
    }

    @Override
    public String toString() {
        return STR."Foo{foo=\{foo}\{'}'}";
    }
}
