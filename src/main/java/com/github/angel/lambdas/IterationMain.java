package com.github.angel.lambdas;

import java.util.List;
import java.util.logging.Logger;

public class IterationMain {
    public static final Logger LOGGER = Logger.getLogger(IterationMain.class.getName());
    /*
    * Historia de  la iteración en java
    * */
    public static void main(String[] args) {
        LOGGER.info("Historia de  la iteración en java");
        List<String> nombres = List.of("Juan", "Pedro", "Maria", "Angel", "Fernando", "Ana", "Diana");
        Collection<String> collection = new Collection<>(10);
        collection.add("Juan");
        collection.add("Pedro");
        collection.add("Maria");
        collection.add("Angel");
        collection.add("Fernando");
        for (String s : collection) {
            System.out.println(s);
        }
    }




}
