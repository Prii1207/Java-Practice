package com.practice.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FilterDuplicates {
     static List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

    private static void filterUsingSet(){
        Set<Integer> distinctElemnts = new HashSet<>(myList);
        distinctElemnts.stream().forEach(System.out::println);
    }

    private static void usingDistinctMethod(){
        List<Integer> uniqueElmnts = myList.stream().distinct().collect(Collectors.toList());
        System.out.println("Using Distinct Method: "+uniqueElmnts);
    }

    public static void main(String[] args) {
        filterUsingSet();
        //usingDistinctMethod();
    }

}
