package com.practice.streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {

    public static void firstNonRepeatingChar(String str){
        Character result = str.toLowerCase().chars().
                mapToObj(c -> (char)c).
                collect(Collectors.groupingBy(n-> n, LinkedHashMap::new,
                        Collectors.counting()))
                .entrySet().stream().
                filter(e -> e.getValue() ==1).
                map(Map.Entry::getKey).
        findFirst().orElse(null);
        System.out.println("First Non repeating Char: "+result);
    }

    public static void main(String[] args) {
        firstNonRepeatingChar("SwissWanIsCool");
    }
}
