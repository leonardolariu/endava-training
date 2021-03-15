package com.leonardolariu.streams;

import java.util.stream.DoubleStream;

public class Laziness {

    public static void main(String[] args) {
        DoubleStream fractions = DoubleStream.iterate(.5, d -> d / 2); // iteration, if computed as such, would never end

        // the iteration is done when a terminal operation requires it
        fractions.limit(3).forEach(System.out::println);
    }
}
