package com.practice.streams.interview.qns;

import java.util.Arrays;
import java.util.List;

public class CountTheChars {

    public static void countTheChar(String str){
        List<String> list = Arrays.asList("apple", "Ant", "ball", "cheesse","ballon");
char ch = Character.toLowerCase(str.charAt(0));
        int count = (int)list.stream()
                .filter(s -> Character.toLowerCase(s.charAt(0)) ==ch).count();
        System.out.println(count);
    }

    public static void main(String[] args) {
        countTheChar("A");
    }
}
