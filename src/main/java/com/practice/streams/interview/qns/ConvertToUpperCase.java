package com.practice.streams.interview.qns;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertToUpperCase {

    public static void convertToUpperCase(){
        List<String> list = Arrays.asList("appLe","Ball","caT", "dOg", "tree");
        List<String> mappedList = list.stream()
                .map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(mappedList);
    }

    public static void main(String[] args) {
         convertToUpperCase();
    }
}
