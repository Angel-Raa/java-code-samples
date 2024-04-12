/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.github.angel.linked;

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

    /**
     * Metodo para agregar un elemento a la lista
     * @param elemento
     * @return
     */
    public void add(int elemento) {
        this.start = new Nodo(elemento, start);
        if (this.end == null) {
            this.end = this.start;
        }
    }

    /**
     * Metodo para imprimir la lista
     *
     */
    public void print() {
        Nodo tmp = this.start;
        while (tmp != null) {
            System.out.print(tmp);
            tmp = tmp.getSiguiente();
        }
    }

    public boolean isEmpty () {
        return this.start == null;
    }

    public void addEnd(int elemento) {
        if(!isEmpty()){
            this.end = new Nodo(elemento);
            this.end = end.getSiguiente();
        }
        this.start = this.end = new Nodo(elemento);

    }



}
