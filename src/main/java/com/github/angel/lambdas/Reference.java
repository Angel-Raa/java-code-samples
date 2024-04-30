package com.github.angel.lambdas;

import com.github.angel.lambdas.schema.Person;
import org.jetbrains.annotations.Contract;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Reference {
    public static void main(String[] args) {
        Function<Person, String> function = Person::getNombre;
        System.out.println("Hello World");
        final int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final Person[] nombres = new Person[]{new Person("Angel", "Gonzalez", "angel@example"),
                new Person("Perez", "Gonzalez", "perez@gmail.com"),
                new Person("Miguel", "Gonzalez", "miguel@gmail.com"),
                new Person("Juan", "Gonzalez", "juan@gmail.com")
        };
        Arrays.stream(numbers).map(Reference::square)
                .filter(Reference::filter)
                .forEach(System.out::println);
        System.out.println("-------------------------------------------------");
        List<String> soloNombres = Arrays.stream(nombres).map(function)
                .toList();
        System.out.println(soloNombres);
        System.out.println("-------------------------------------------------");
    }

    @Contract(pure = true)
    public static int square(final int n) {
        return n * n;
    }

    @Contract(pure = true)
    public static boolean filter(final int n) {
        if (n < 0) return false;
        return n % 2 == 0;
    }


}
