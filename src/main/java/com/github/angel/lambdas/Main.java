package com.github.angel.lambdas;

import com.github.angel.lambdas.utils.Consumer;
import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.logging.Logger;

public class Main {
    public static final  Logger log = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        List<String> nombres  = List.of("Angel", "Aguero", "Jose", "Maria", "Pedro");
        print(System.out::println, nombres);
        nombres.forEach(System.out::println);



    }
    public static <T> void print(@NotNull Consumer<T> consumer, T values){
        consumer.accept(values);
    }








}
