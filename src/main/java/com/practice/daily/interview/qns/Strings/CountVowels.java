package com.practice.daily.interview.qns.Strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountVowels {

    public static void countVowels(String str){
        Set<Character> vowles = new HashSet<>(Arrays.asList('a','e','i','o','u'));

       int count = 0;
       str = str.toLowerCase();
       for(int i =0;i<str.length();i++){
           char ch = str.charAt(i);
           if(vowles.contains(ch)){
               count++;
           }
       }
       System.out.println("Count of Vowels: "+count+" in a String: "+str);

    }

    public static void main(String[] args) {
        countVowels("few apple");
    }
}
