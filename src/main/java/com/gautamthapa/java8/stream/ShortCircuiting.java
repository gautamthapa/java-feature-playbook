package com.gautamthapa.java8.stream;

import java.util.Optional;

public class ShortCircuiting {
    void main() {
        System.out.println("Short Circuiting in Java 8 Stream API");
        System.out.println("=====================================");

        // Short-circuiting operations: anyMatch, allMatch, noneMatch, findFirst, findAny
        // Example: Using anyMatch to check if any number is greater than 5
        boolean anyGreaterThan5 = java.util.stream.IntStream.range(1, 10)
                .anyMatch(n -> n > 5);
        System.out.println("Is there any number greater than 5? " + anyGreaterThan5);

        // Example: Using findFirst to get the first even number
        java.util.OptionalInt firstEven = java.util.stream.IntStream.range(1, 10)
                .filter(n -> n % 2 == 0)
                .findFirst();
        System.out.println("First even number: " + firstEven.orElse(-1));
    }
}