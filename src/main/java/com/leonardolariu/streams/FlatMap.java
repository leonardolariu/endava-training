package com.leonardolariu.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {

    public static void main(String[] args) {
        List<Integer> primeNumbers = Arrays.asList(5, 7, 11, 13);
        List<Integer> oddNumbers = Arrays.asList(1, 3, 5);
        List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listOfListOfInts =
            Arrays.asList(primeNumbers, oddNumbers, evenNumbers);

        System.out.println("The Structure before flattening is : " + listOfListOfInts);

        // Using flatMap for transforming and flattening.
        List<Integer> listOfInts  = listOfListOfInts.stream()
            .flatMap(Collection::stream)
            .collect(Collectors.toList());

        System.out.println("The Structure after flattening is : " + listOfInts);
    }
}
