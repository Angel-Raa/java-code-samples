package com.github.angel.lambdas;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntPredicate;

public class Matcher {
    public static void main(String[] args) {
       final int[] arr = {2, 4, 6, 8, 9, 12, 16, 19, 26, 31, 43, 55, 65, 71, 84, 99, 100};
        IntPredicate fiIntPredicate = (n) -> n % 2 == 0;
        IntPredicate isOdd = n -> n % 2 !=0;
        // allMatch
        boolean allMatch = Arrays.stream(arr)
                .allMatch(fiIntPredicate);
        System.out.println(allMatch);

        // anyMatch

        boolean anyMatch = Arrays.stream(arr).anyMatch(fiIntPredicate);
        System.out.println(anyMatch);
        // noneMatch
        boolean noneMatch = Arrays.stream(arr).noneMatch(isOdd);
        System.out.println(noneMatch);
        System.out.println("=============================================================");
        List<Integer> sorted = Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.naturalOrder())
                        .toList();
        System.out.println(sorted);

    }


}
