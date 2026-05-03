package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountCharactersInWords {

    public static void countChars(){
        List<String> words = Arrays.asList("java", "stream", "lambda", "spring", "api");
       Map<Integer, List<String>> frequency=
        words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(frequency);
    }

    public static void main(String[] args) {

        countChars();
    }
}
