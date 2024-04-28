package com.github.angel.lambdas.stream;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] arr = {"Hola", "Mundo"};
        Function<Integer, String> function = x -> STR."Esto en numero formatiado \{x.toString()}";
        List<String> nombres = List.of("Juan", "Pedro", "Maria", "Minerva", "Rafaela", "Alba", "Angel", "Jessica", "John", "Ana", "Liz", "Yua");
        // Map
        Arrays.stream(arr).map(Main::upperCase).forEach(System.out::println);

        nombres.stream().map(Main::upperCase)
                .forEach(System.out::println);
         String apply = function.apply(10);

    }

    @Contract(pure = true)
    public static @NotNull String upperCase(@NotNull String values){
        String name = values.substring(0, 1).toUpperCase();
       return  name + values.substring(1);
    }
}
