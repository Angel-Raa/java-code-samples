package com.github.angel.lambdas;

import com.github.angel.lambdas.utils.Consumer;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.logging.Logger;

public class Main {
    public static final Logger log = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        BiPredicate<String, String> startWith = (value, vocal) -> value.startsWith(vocal);
        final List<String> amigos = List.of("Angel", "Aguero", "Jose", "Maria", "Pedro");
        final List<String> enemigos = List.of("Adriana", "John", "Miguel", "Yoi", "Rafael");
        final List<String> conocidos = List.of("Jose", "Maria", "Adriana", "Miguel", "Yoi", "Rafael");



        final List<String> amigosFiltrados = amigos.stream().filter(amigo -> startWith.test(amigo, "A")).toList();
        final List<String> enemigosFiltrados = enemigos.stream().filter(amigo -> filter(amigo, "M")).toList();
        final List<String> conocidosFiltrados = conocidos.stream().filter(amigo -> amigo.startsWith("G")).toList();

        System.out.println("---------------------------");
        print(System.out::println, amigosFiltrados);
        System.out.println("---------------------------");
        print(System.out::println, enemigosFiltrados);
        System.out.println("---------------------------");
        print(System.out::println, conocidosFiltrados);


    }

    public static <T> void print(@NotNull Consumer<T> consumer, T values) {
        consumer.accept(values);
    }


    @Contract(pure = true)
    public static boolean filter(@NotNull final String value, final String vocal) {
        return value.startsWith(vocal);
    }


}

