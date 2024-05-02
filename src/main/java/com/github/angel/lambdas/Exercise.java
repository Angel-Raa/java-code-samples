package com.github.angel.lambdas;

import java.util.Arrays;
import java.util.function.IntPredicate;

public class Exercise {
    public static void main(String[] args) {
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 2};
        String[] nombres = {"ana", "fernando", "jorge", "diana", "raul"};

//        System.out.println(Arrays.toString(isPares(arreglo)));
//        System.out.println(max(arreglo));
//        System.out.println(min(arreglo));
//        System.out.println(appears(arreglo, 2));
//        System.out.println(isVocal("A"));
//        String[] result = cadena(nombres);
//        Arrays.stream(result).forEach(System.out::println);
//        String[] order = order(nombres);
//        Arrays.stream(order).forEach(System.out::println);

        String[] a = filterAll(nombres, "a");
        Arrays.stream(a).forEach(System.out::println);

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

    /**
     * Problema:
     * Dada el arreglo de números, encontrar el número más grande y el más pequeño.
     */

    public static int max(int[] arr) {
        return Arrays.stream(arr).max().orElseThrow();
    }

    public static int min(int[] arr) {
        return Arrays.stream(arr).min().orElseThrow();
    }

    /*
    Problema:
    Dada el arreglo de números, encontrar cuántas veces aparece el número 10.
   */

    public static int appears(int[] arr, int tag) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i == tag) {
                count++;
            }
        }
        return count;
    }

    /*
    Problema:
    Dada el arreglo de cadenas, imprimir cada nombre de tal forma que estén en mayúsculas,
    y que cada vocal sea reemplazada por una "X", ejemplo:
    "XNX", "FXRNXNDX" ... etc.
 */
    public static String[] cadena(String[] arr){
        return  Arrays.stream(arr).map(name -> name.toUpperCase().replaceAll("aeiouAEIOU", "X"))
                .toArray(String[]::new);


    }

    public static boolean isVocal (String v ){
        final String[] vocales = {"a", "e", "i", "o", "u"};
        return Arrays.stream(vocales).anyMatch(n -> n.equalsIgnoreCase(v));
    }

    /*
    Problema:
    Dada el arreglo de cadenas, ordenarlo alfabéticamente y mostrarlo en pantalla.
    Ordenarlo primero de manera ascendente, posteriormente en orden inverso.
 */
    public static String[] order (final String[] arr) {
        return Arrays.stream(arr).sorted(String::compareTo)
                .toArray(String[]::new);
    }

    /*
    Problema:
    Dada el arreglo de cadenas, mostrar solo las cadenas que empiezan con la letra a,
    posteriormente, ordenarlas alfabéticamente tanto en orden ascendente como descendente.
    */
    public static String[] filterAll (final String[] arr, String tag){
        return Arrays.stream(arr).filter(letra -> letra.startsWith(tag))
                .toArray(String[]::new);
    }
}
