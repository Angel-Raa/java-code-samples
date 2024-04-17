package com.github.angel.generic;

import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        Foo<String > arror = new Foo<>("Arror");
        List<Foo<String>> lista = List.of(arror);
        List<Number> listado = new ArrayList<>();
        listado.add(10);
        listado.add(10L);



    }

    public  void process (List<? extends Foo> lists){
        lists.forEach(System.out::print);
    }
}
