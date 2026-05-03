package com.practice.streams;

import java.util.stream.Collectors;

public class RemoveDuplicatesFromAString {

    public static void removeDuplicates(){
        String input = "Programmingpp";
        String result = input.toLowerCase().chars().
                distinct().mapToObj(c -> (char)c).
                map(String::valueOf).collect(Collectors.joining());

        System.out.println("Result: "+result);
    }

    public static void main(String[] args) {
        removeDuplicates();
    }
}
