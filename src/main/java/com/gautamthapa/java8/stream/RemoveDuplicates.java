package com.gautamthapa.java8.stream;

import java.util.List;

public class RemoveDuplicates {
    static void main() {

        // distinct() uses equals and hashCode methods to determine duplicates. It retains the first occurrence of each element and removes subsequent duplicates.

        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 1, 5);
        List<Integer> uniques = numbers.stream()
                .distinct() // Removes duplicates
                .toList(); // Collects the result into a List

        System.out.println(uniques);


        //
    }
}
