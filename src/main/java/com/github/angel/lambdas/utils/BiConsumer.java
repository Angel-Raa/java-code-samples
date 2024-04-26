package com.github.angel.lambdas.utils;

@FunctionalInterface
public interface BiConsumer<T, K> {
    void accept(T t, K k);
}
