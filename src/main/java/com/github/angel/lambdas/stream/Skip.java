package com.github.angel.lambdas.stream;

import com.github.angel.lambdas.schema.Venta;

import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Skip {
    public static void main(String[] args) {
       // Omitir elementos con lambdas
//        IntStream.range(0, 100)
//                .skip(50)
//                .forEach(System.out::println);
        System.out.println("---------------------------");

        List<Venta> ventas = Arrays.stream(Month.values())
                .map(month -> new Venta(month, generaDouble()))
                .toList();
        System.out.println("---------------------------");

        // Trimeestrale, Q1, Q2, Q3, Q4

        List<Venta> halfYear = ventas.stream()
                .skip(6)
                .toList();

        System.out.println("---------------------------");
        halfYear.forEach(System.out::println);
    }

    public static  Double generaDouble() {
        return new Random().nextDouble(2000);
    }

}
