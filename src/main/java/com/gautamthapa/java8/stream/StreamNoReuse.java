package com.gautamthapa.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamNoReuse {
    static void main() {
        // Create a stream of integers
        var numbers = Stream.of(1, 2, 3, 4, 5);

        // Use the stream to perform an operation (e.g., print each number)
        numbers.forEach(System.out::println);

        // Attempting to reuse the same stream will throw an exception
        try {
            numbers.forEach(System.out::println); // This will throw IllegalStateException
        } catch (IllegalStateException e) {
            System.out.println("Cannot reuse a stream: " + e.getMessage());
        }


        // Correct Approach
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
        // Create a new stream for each operation
        names.stream().filter(name -> name.startsWith("A")).forEach(System.out::println);
        names.stream().filter(name -> name.startsWith("B")).forEach(System.out::println);

    }
}
