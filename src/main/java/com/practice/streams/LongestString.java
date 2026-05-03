package com.practice.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {

    public static void longestStringInList(){
        List<String> list = Arrays.asList("Programmer", "USA", "IamLongest","Learning", "acheive");
        String longestString = list.stream().
                max(Comparator.comparingInt(String::length)).orElse(null);
        System.out.println("Longest String: "+longestString);
    }

    public static void main(String[] args) {
        longestStringInList();
    }
}
