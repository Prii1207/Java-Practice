package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequency {

    public static void getFrequency() {

        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Long> frequency = words.stream().
                collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println("Frequency: " + frequency);
    }

    public static void main(String[] args) {
        getFrequency();
    }

}
