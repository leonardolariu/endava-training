package com.leonardolariu.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class InfiniteStreams {

    public static void main(String[] args) {
        int limit = 0; // try with 0, 1 or many

        int[] ints = Stream.iterate(1, n -> n+2)
            .limit(limit) // it is mandatory that a short-circuit operation consumes the infinite stream
            .mapToInt(Integer::valueOf)
            .toArray(); // traversable only once!

        System.out.println("reduce with identity value: " +
            Arrays.stream(ints)
                .reduce(0, Integer::sum)
        );

        System.out.println("reduce without identity value: " +
            Arrays.stream(ints)
                .reduce(Integer::sum) // returns OptionalInt.empty if stream is empty
                .orElse(-1) // it is a good practice to handle Optional.empty values that terminal operation might return
        );
    }
}
