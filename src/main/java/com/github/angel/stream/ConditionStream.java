/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.github.angel.stream;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.function.Consumer;

/**
 *
 * @author aguero
 */
public class ConditionStream {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20));

        Consumer<Integer> action = (values) -> {
            if (values % 2 == 0) {
                System.out.println("Even Number ::" + values);
            } else {
                System.out.println("Odd numbers :: " + values);
            }

        };
        numbers.stream().forEach(action);
        

    }

}
