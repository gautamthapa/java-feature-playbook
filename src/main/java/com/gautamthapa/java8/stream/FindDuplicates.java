package com.gautamthapa.java8.stream;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
    static void main() {
        List<Integer> numbers = List.of(1, 2, 3, 2, 3, 5, 2, 1);

        Set<Integer> numSet = new HashSet<>();

        List<Integer> duplicates = numbers.stream()
                .filter(number -> !numSet.add(number))
                .toList();
        System.out.println(duplicates);

    }
}
