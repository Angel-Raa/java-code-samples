/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.github.angel.linked;

import javax.swing.JOptionPane;

/**
 *
 * @author aguero
 */
public class App {
    public static void main(String[] args) {
        int opcion = 0;
        Lista lista = new Lista();
        int elemento;
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Agregar un elemento al inicion de lista \n2. Mostra los Datos de Lista. \n3. Salir \n4. Inserta a fin de lista. \n5 Elimina un elemento de inicio de lista",
                        "Menu de Opciones ", 3));
                switch (opcion) {
                    case 1 -> {
                        try {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un elemento",
                                    "Insertando al inicio", 3));
                            lista.add(elemento);
                            System.out.println("Elemento agregado");
                        } catch (NumberFormatException e) {
                            System.out.println("Error " + e.getMessage());
                            JOptionPane.showMessageDialog(null, "Error " + e.getMessage());
                        }
                    }
                    case 2 -> {
                        JOptionPane.showMessageDialog(null, "Datos de la lista");
                        lista.print();
                        System.out.println("Fin");

                    }

                    case 3 -> {
                        System.out.println("Saliendo");
                        System.exit(0);
                    }
                    case 4 -> {
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un elemento",
                                "Insertando al final", 3));
                        lista.addEnd(elemento);
                        System.out.println("Elemento agregado");
                    }

                    case 5 -> {
                        elemento = lista.delete();
                        System.out.println("Elemento eliminado " + elemento);
                        JOptionPane.showMessageDialog(null, "Elemento eliminado es " + elemento, "Eliminando Nodo de inicio", JOptionPane.INFORMATION_MESSAGE);
                    }
                    default -> JOptionPane.showMessageDialog(null, "Opcion Incorrecta ");

                }

            } catch (RuntimeException e) {
                System.out.println("Error " + e.getMessage());
            }

        } while (opcion != 3);
    }

}
