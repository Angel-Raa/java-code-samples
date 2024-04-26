package com.github.angel.lambdas;

import com.github.angel.lambdas.schema.Person;
import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class FakeUtils {

    private static  final Faker faker = new Faker(new Locale("es", "RD"));
    public  static String generaNombre(){
        return faker.name().firstName();
    }
    public  static String generaEmail(){
        return faker.name().username()+"@gmail.com";
    }

    public  static String generaApellidos(){
        return faker.name().lastName();
    }
    public static List<Person> generarPersona(int n) {
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
