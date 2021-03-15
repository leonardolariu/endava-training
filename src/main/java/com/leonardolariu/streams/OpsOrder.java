package com.leonardolariu.streams;

import java.util.stream.Stream;

public class OpsOrder {

    public static void main(String[] args) {
        Stream.of("Irina", "Radu_a", "Ana", "Marius")
            .filter(s -> s.endsWith("a"))
            .map(String::toUpperCase)
            .peek(System.out::println)
            .sorted()
            .peek(System.out::println)
            .map(String::toLowerCase)
            .forEach(System.out::println);
    }
}
