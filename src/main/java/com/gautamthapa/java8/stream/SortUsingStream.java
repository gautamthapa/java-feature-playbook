package com.gautamthapa.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortUsingStream {
    static void main() {
        List<Integer> numbers = Arrays.asList(5, 1, 9, 3);

        // Natural Sorting
        List<Integer> sortedList = numbers.stream()
                .sorted() // Sorts in natural order (ascending)
                .toList(); // Collects the result into a List
        System.out.println(sortedList);

        // Reverse Sorting
        List<Integer> reverseSortedList = numbers.stream()
                .sorted((a, b) -> b.compareTo(a)) // Sorts in reverse order (descending)
                .toList(); // Collects the result into a List
        System.out.println(reverseSortedList);
        // OR
        List<Integer> reverseSortedList1 = numbers.stream()
                .sorted(Comparator.reverseOrder()) // Sorts in reverse order (descending)
                .toList(); // Collects the result into a List
        System.out.println(reverseSortedList1);
    }
}
