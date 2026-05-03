package com.practice.streams;

import java.util.*;
import java.util.stream.Collectors;

public class FirstDuplicate {

    public static void firstDuplicate(){
        Set<String> seen = new HashSet<>();
        List<String> str = Arrays.asList("apple", "banana", "apple","cherry", "banana");
        String duplicate = str.stream().
                filter(s -> !seen.add(s))
                .findFirst().orElse(null);
        System.out.println(duplicate);

    }

    public static void main(String[] args) {
        firstDuplicate();
    }
}
