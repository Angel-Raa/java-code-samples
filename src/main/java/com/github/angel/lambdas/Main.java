package com.github.angel.lambdas;

import com.github.angel.lambdas.schema.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {
    public static final  Logger log = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        List<Person> personList = generarPersona(3);
        log.info("Ante del ordenamiento.");
        System.out.print(personList);
        log.info("despues del ordenamiento.");
        personList.sort((o1, o2) -> {
            int first = o1.getNombre().length();
            int last =  o2.getNombre().length();
           return Integer.compare(first, last);
        });
        System.out.println(personList);


    }







    private static List<Person> generarPersona(int n) {
        List<Person> personList = new ArrayList<>();
        for (int index = 0; index < n; index++){
            String nombre= FakeUtils.generaNombre();
            String apellidos = FakeUtils.generaApellidos();
            String email = FakeUtils.generaEmail();
            personList.add(new Person(nombre, apellidos, email));
        }
        return personList;
    }
}
