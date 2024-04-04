/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.github.angel.models.stream;

import java.util.stream.IntStream;

/**
 *
 * @author aguero
 */
public class ApiStream {
    public static void main(String[] args) {
      int max = IntStream.range(1, 10)
      .max()
      .getAsInt();

      double aver = IntStream.range(1, 10)
      .average()
      .getAsDouble();
      int sum = IntStream.range(1, 10)
      .sum();
      int min = IntStream.range(1, 10)
      .min()
      .getAsInt();
        System.out.println("Elemento minimo:  " + min);
      System.out.println("Suma de todo los elementos " + sum);
      System.out.println("Elemento maximo : " + max);
      System.out.println("media aritmética : " + aver);
    }
}
