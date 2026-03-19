package com.gautamthapa.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsLazy {
    static void main() {
        // Stream operations are lazy, meaning they are not executed until a terminal operation is invoked.
        // This allows for efficient processing of large data sets and enables the use of short-circuiting operations.

        // Example of lazy evaluation:
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // Intermediate operation (lazy)
        Stream<String> nameStream = names.stream()
                .filter(name -> {
                    System.out.println("Filtering: " + name);
                    return name.startsWith("A");
                });

        // Terminal operation (triggers the execution of the stream)
        long count = nameStream.count();
        System.out.println("Count of names starting with 'A': " + count);
    }
}
