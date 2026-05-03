package com.practice.streams.interview.qns;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class MaxAndMins {

    public static void maxAndMinString(){
        List<String> list = Arrays.asList("Apple", "java", "api", "US","Streams", "Computer");
      String minString =  list.stream().
              min(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(minString);

        String maxString =  list.stream().
                max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println(maxString);

    }

    public static void main(String[] args) {
        maxAndMinString();
    }
}
