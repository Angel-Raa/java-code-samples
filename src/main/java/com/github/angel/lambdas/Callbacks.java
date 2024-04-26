package com.github.angel.lambdas;

import com.github.angel.lambdas.utils.Function;
import java.util.logging.Logger;

public class Callbacks {
    public static final Logger LOGGER = Logger.getLogger(Callbacks.class.getName());
    public static void main(String[] args) {
        // Java High Order Functions
        LOGGER.info("Java High Order Functions");
        Function<Integer, Integer> square = x -> x * x;
        Function<Integer, Integer> triple = x -> x * x * x;
        Function<String, String > reverse = x -> new StringBuilder(x).reverse().toString().toLowerCase();
        System.out.println(function(square, 2));
        System.out.println(function(triple, 2));
        System.out.println(function(reverse, "Hello"));


    }

    public static  <T, R> R function (Function<T, R> function, T value) {
        return function.apply(value);
    }
}
