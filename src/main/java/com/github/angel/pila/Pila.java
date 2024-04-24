package com.github.angel.pila;

public class Pila {
     int[] vector;
     int cima;

    public Pila(int cima) {
        this.vector = new int[cima];
        this.cima = -1;
    }

     // Metodo push
    public  void push(int element){
        this.cima++;
        this.vector[cima] = element;
    }

    // Metedo pop
    public int pop () {
        int tmp = this.vector[this.cima];
        this.cima--;
        return tmp;
    }

    // Metodo para saber si la pila esta vacia
    public boolean isEmpty(){
        return this.cima == -1;
    }

    // Metodo para saber si la pila esta llena
    public  boolean isFull(){
        return this.vector.length-1 == this.cima;
    }

    public int cima() {
        return this.vector[cima];
    }

    public int size(){
        return this.vector.length;
    }

    public static void main(String[] args) {
        Pila pila = new Pila(5);

        pila.push(10);
        pila.push(20);
        pila.push(30);
        System.out.println(pila.cima());
        System.out.println("Tiene elementos:  " + pila.isFull());
        System.out.println("Elimina elemento : "   + pila.pop());
    }
}
