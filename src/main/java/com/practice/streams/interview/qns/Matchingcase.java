package com.practice.streams.interview.qns;

import java.util.Arrays;
import java.util.List;

public class Matchingcase {

    static List<String> list = Arrays.asList("Java", "Stream", "Code","API");
    public static void allMatchCase(){
        boolean allMatchCase = list.stream().allMatch(s -> s.length() >4);
        System.out.println( allMatchCase);
    }

    public static void anyMatchCase(){
        boolean anyMatchCase = list.stream().anyMatch(s -> s.startsWith("J"));
        System.out.println(anyMatchCase);
    }

    public static void  noneMatchCase(){
        boolean noneMatchCase = list.stream().noneMatch(s -> s.startsWith("x"));
        System.out.println(noneMatchCase);
    }

    public static void main(String[] args) {

        allMatchCase();
        anyMatchCase();
        noneMatchCase();
    }
}


