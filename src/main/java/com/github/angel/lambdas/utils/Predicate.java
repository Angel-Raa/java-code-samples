package com.github.angel.lambdas.utils;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
