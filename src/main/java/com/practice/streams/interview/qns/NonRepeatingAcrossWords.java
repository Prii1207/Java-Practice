package com.practice.streams.interview.qns;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;

public class NonRepeatingAcrossWords {

    public static void nonRepeatingAcrossWords(){
        List<String> words = Arrays.asList("java", "stream", "api", "spring", "boot");
        String firstNonRepeatingChar = String.valueOf(words.stream().
                flatMap(word -> word.chars().mapToObj(c -> (char)c)).
                collect(Collectors.groupingBy(n-> n, LinkedHashMap::new,
                        Collectors.counting())).
                entrySet().stream().
                filter(e -> e.getValue() ==1).map(e -> e.getKey()).findFirst().
                orElse(null));
        System.out.println(firstNonRepeatingChar);
   }

    public static void main(String[] args) {
        nonRepeatingAcrossWords();
    }

}
