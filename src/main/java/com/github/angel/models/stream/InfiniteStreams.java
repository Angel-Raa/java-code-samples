/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.github.angel.models.stream;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 *
 * @author aguero
 */
public class InfiniteStreams {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Random random = new Random();
        SecureRandom secureRandom = SecureRandom.getInstanceStrong();
        // iterate()
        List<Integer> numbers = IntStream.iterate(0, it -> it + 2)
        .mapToObj(Integer::valueOf)
        .limit(10)
                .collect(Collectors.toList());

        //numbers.forEach(System.out::println);

        // generate()
        List<Integer> numbers2 = IntStream.generate(() -> (int) (Math.random() * 100))
        .limit(10)
        .mapToObj(Integer::valueOf)
        .collect(Collectors.toList());

        // aleatorios
        IntStream randoInt = random.ints(5);
        //randoInt.forEach(System.out::println);

        DoubleStream doubleStream = random.doubles(5, 10).limit(3);
        doubleStream.forEach(System.out::println);

        LongStream longStream = random.longs(5, 10).limit(3);
        //longStream.forEach(System.out::println);

        // SecureRandom
        byte[] bytes = new byte[128];
        secureRandom.nextBytes(bytes);
        
        
        
       
    }

}
