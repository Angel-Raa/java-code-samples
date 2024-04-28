package com.github.angel.lambdas.stream;

import java.util.List;

public class Filtrar {
    public static void main(String[] args) {
        List<String> nombres = List.of("Juan", "Pedro", "Maria", "Minerva", "Rafaela", "Alba", "Angel", "Jessica", "John", "Ana", "Liz", "Yua");
        // Java Predicate
        List<String> stringList = nombres.stream()
                .filter(letra -> letra.startsWith("A"))
                .filter(letra -> letra.length() >= 4)
                .sorted(String::compareTo)
                .map(String::toUpperCase)
                .toList();

        stringList.forEach(System.out::println);
    }


}
