package com.github.angel.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Reduce {
    public static void main(String[] args) {
        String[] cadenas = {"Hola", "Mundo", "Java", "and", "spring", "boot"};
        List<Integer> integers = IntStream.range(0, 10)
                //.limit(15)
                .boxed()
                .toList();
        Optional<Integer> reduceSum = integers.stream().reduce(Integer::sum);
        //System.out.println(reduceSum);

        Optional<Integer> reduceCompareTo = integers.stream().reduce(Integer::max);
        System.out.println(reduceCompareTo);
        Optional<String> optionalString = Arrays.stream(cadenas).reduce((str1, str2) -> STR."\{str1} \{str2}");
        System.out.println(optionalString);


    }
}
