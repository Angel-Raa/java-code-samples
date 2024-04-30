package com.github.angel.lambdas;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.OptionalInt;

public class IntStreamCustomized {
    public static void main(String[] args) {
        final int[] arreglos = {6, 1, 2, 5, 6, 10, 8, 9, 4, 2, 1, 9, 6, 4, 3, 1, 10, 9, 8, 7, 5, 3};
        final int[] array = Arrays.stream(arreglos)
                .distinct()
                .sorted()
                .filter(IntStreamCustomized::isEven)
                .toArray();
        System.out.println(Arrays.toString(array));
        System.out.println("=========================================================");
        OptionalInt min = Arrays.stream(arreglos)
                .min();

        OptionalInt max = Arrays.stream(arreglos).max();
        int summed = Arrays.stream(arreglos).sum();
        IntSummaryStatistics intSummaryStatistics = Arrays.stream(arreglos).summaryStatistics();
        System.out.println(intSummaryStatistics);
        System.out.println("=========================================================");
        long count = Arrays.stream(arreglos).count();
        System.out.println(count);

    }

    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
