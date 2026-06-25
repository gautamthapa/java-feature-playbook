package com.gautamthapa.java8.stream;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {
    static void main() {
        String chars = "aabbcc";
        Map<Character, Long> map = chars.chars()
                .mapToObj(c -> (char) c)
                .collect(
                        Collectors.groupingBy(Function.identity(), Collectors.counting())
                );
        System.out.println(map);
    }
}
