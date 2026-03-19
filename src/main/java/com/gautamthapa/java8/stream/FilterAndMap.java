package com.gautamthapa.java8.stream;

import java.util.Arrays;

public class FilterAndMap {
    static void main() {

        // filter() is used to select elements from a stream based on a given predicate. It takes a Predicate as an argument and returns a new stream that contains only the elements that satisfy the condition defined by the predicate.
        // map() is used to transform each element of a stream into another form. It takes a Function as an argument and returns a new stream that contains the results of applying the function to each element of the original stream.

        String[] names = {"Gautam", "Thapa", "Java", "Stream", "Filter", "Map"};
        // Filter the names that start with 'T' and convert them to uppercase
        String[] filteredAndMappedNames = java.util.Arrays.stream(names)
                .filter(name -> name.startsWith("T")) // select
                .map(String::toUpperCase) // transform
                .toArray(String[]::new);

        // Print the filtered and mapped names
        Arrays.stream(filteredAndMappedNames).forEach(System.out::println);
    }
}
