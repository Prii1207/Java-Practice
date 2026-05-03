package com.practice.streams.interview.qns;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringConcatenation {

    public static void stringConcats(){
        List<String> list = Arrays.asList("Java", "Stream", "Code","API");
        String concatedString = list.stream()
                .collect(Collectors.joining(","));
        System.out.println(concatedString);
    }

    public static void main(String[] args) {
        stringConcats();
    }
}
