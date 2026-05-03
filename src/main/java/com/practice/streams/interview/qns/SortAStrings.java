package com.practice.streams.interview.qns;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortAStrings {

    public static void sortAStringsBasedOnLength(){
        List<String> list = Arrays.asList("Apple", "java", "api", "US","Streams", "Computer");
        List<String> sortedList = list.stream()
                .sorted(Comparator.comparingInt(String::length))
                .collect(Collectors.toList());
        System.out.println(sortedList);
    }

    public static void main(String[] args) {
        sortAStringsBasedOnLength();
    }
}
