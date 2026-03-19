package com.gautamthapa.java8.stream;

import java.util.List;
import java.util.stream.Collectors;

public class MapAndFlatMapExample {
    static void main() {
        // map() transforms each element into exactly one output element.
        // one-to-one transformation
        List<String> names = List.of("Alice", "Bob", "Charlie", "David");

        List<Integer> lengths = names.stream()
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println(lengths);


        // flatMap() transforms each element into a stream of output elements, which are then flattened into a single stream.
        // one-to-many transformation + flattening
        List<List<String>> nestedNames = List.of(
                List.of("Alice", "Bob"),
                List.of("Charlie", "David"));

        List<String> result = nestedNames.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
