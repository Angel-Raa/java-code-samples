package com.github.angel.stream;

import java.time.LocalDate;
import java.time.Period;
import java.util.stream.Stream;

public class ApiDates {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.print(today);
        Stream<LocalDate>sameDayNext = today.datesUntil(today.plusDays(21), Period.ofDays(1));

        //sameDayNext.forEach(System.out::print);
    }
}
