package com.github.angel.lambdas;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class Exercise {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(isPares(arreglo)));

    }

    /*
    Problema:
    Dada el arreglo de números, filtrar sólo los números pares.
  */

    public static int[] isPares(int[] arr) {
        return Arrays.stream(arr).filter(n -> n % 2 == 0).toArray();
    }

    /*
    Problema:
    Dada el arreglo de números, calcular la suma de todos los elementos.
    Posteriormente, también buscar la suma de solo los elementos pares.
 */

    public static int sumEvenNumber(int[] arr) {
        IntPredicate filter = n -> n % 2 == 0;
        return Arrays.stream(arr)
                .filter(filter)
                .sum();

    }
}
