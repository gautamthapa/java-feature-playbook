package com.gautamthapa.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IntermediateAndTerminal {
    static void main() {
            /*
            Intermediate operations are those that return a stream and are lazy, meaning they are not executed until a terminal operation is invoked. Examples include filter(), map(), and sorted().

            Terminal operations are those that produce a result or a side-effect and trigger the execution of the intermediate operations. Examples include forEach(), collect(), and reduce().
            */

        List<String> result = Arrays.asList("Java", "Python", "JavaScript", "C++", "Ruby").stream()
                .filter(s -> s.length() > 4 ) // intermediate
                .map(String::toUpperCase) // intermediate
                .collect(Collectors.toList()); // terminal

        System.out.println(result);
    }
}
