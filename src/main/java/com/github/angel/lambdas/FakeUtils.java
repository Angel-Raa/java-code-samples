package com.github.angel.lambdas;

import com.github.javafaker.Faker;

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



}
