package com.practice.streams.interview.qns;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FrequencyOfAword {

    public static void wordFrequency(){
        List<String> words = Arrays.asList("java", "stream", "lambda", "spring", "api");

        Map<Integer,List<String>> frequency = words.stream().
                collect(Collectors.groupingBy(String::length));
        System.out.println("Frequency: "+frequency);

    }

    public static void main(String[] args) {
        wordFrequency();

    }
}
