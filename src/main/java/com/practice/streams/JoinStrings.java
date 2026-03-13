package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinStrings {

    private static void joinStrings(){
        List<String> list =  Arrays.asList("Java", "Spring", "AWS", "Docker");
       String convertedList = list.stream().map(s -> s.toUpperCase()).collect(Collectors.joining(","));
System.out.println("Converted String: "+ convertedList);
    }

    public static void main(String[] args) {
        joinStrings();
    }

}
