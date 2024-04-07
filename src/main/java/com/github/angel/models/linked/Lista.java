/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.github.angel.models.linked;

/**
 *
 * @author aguero
 */
public class Lista {
    private Nodo start;
    private Nodo end;

    public Lista() {
        this.start = null;
        this.end = null;
    }

    /*
     * Metedo para agregar un Nodo al inicion de lista
     */
    public void add(int elemento) {
        this.start = new Nodo(elemento, start);
        if (end == null) {
            this.end = this.start;
        }
    }

    /*
     * Mostra Lista
     */
    public void print() {
        Nodo tmp = this.start;
        while (tmp != null) {
            System.out.println(tmp);
            tmp = tmp.getSiguiente();
        }
    }


}
