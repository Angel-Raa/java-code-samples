package com.github.angel.lambdas;


import java.util.Arrays;

public class FlatMap {
    public static void main(String[] args) {
        int[][] arr = {{0, 1, 2, 3}, {4, 5, 6} , {7, 8, 9}};
        int[] array = Arrays.stream(arr)
                .flatMapToInt(Arrays::stream)
                .toArray();
        System.out.println( Arrays.stream(array).sum());


    }

}
