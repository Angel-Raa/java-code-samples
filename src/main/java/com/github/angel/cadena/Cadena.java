package com.github.angel.cadena;

public class Cadena {
    public static void main(String[] args) {
        char[] data = new char[]{'a', 'n', 'g', 'e', 'l'};
        String dataString = new String(data);
        String name =  "Angel Rafael Aguero Aquino";
        System.out.println("Longitud de una cadena :  " + name.length());
        System.out.println("Esta vacion  :" +name.isEmpty());
        // Devuelve el charvalor en el índice especificado
        System.out.println("charAt : " + name.charAt(0) );
        // Devuelve el carácter (punto de código Unicode) en el índice especificado.
        System.out.println("códigoPointAt : " + name.codePointAt(2));
       // Devuelve el número de puntos de código Unicode en el rango de texto especificado de este archivo String
        System.out.println("codePointAt : " + name.codePointCount(1, 7));
        // equals
    }
}
