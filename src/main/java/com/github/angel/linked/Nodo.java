/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.github.angel.linked;

import static java.lang.StringTemplate.STR;

/**
 *
 * @author aguero
 */
public class Nodo {
    private int dato;
    private Nodo siguiente;
    private Nodo anterior;

    // para inserta al final
    public Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    // para inserta al inicion
    public Nodo(int dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    @Override
    public String toString() {
        return STR."\{dato} =>";
    }
}
