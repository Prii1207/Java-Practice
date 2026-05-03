package com.practice.streams;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfChar {

    public static void frequencyOfChar(String str){
        Map<Character, Long> frequency = str.toLowerCase().chars().
                mapToObj(c -> (char)c).
                collect(Collectors.groupingBy(n -> n, LinkedHashMap::new,Collectors.counting()));
        System.out.println(frequency);
    }

    public static void main(String[] args) {
        frequencyOfChar("appleAoret");
    }
}
