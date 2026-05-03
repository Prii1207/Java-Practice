package com.practice.streams.interview.qns;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyWithTwist {

    public static void wordFrequency(){
        List<String> words = Arrays.asList("java", "api", "java", "stream", "api", "java");
        Map<String, Integer> frequency = words.stream().
                collect(Collectors.groupingBy(n->n,
                        Collectors.collectingAndThen(Collectors.counting(), Long::intValue)));
        System.out.println(frequency);
    }

    public static void main(String[] args) {
        wordFrequency();


    }
}
