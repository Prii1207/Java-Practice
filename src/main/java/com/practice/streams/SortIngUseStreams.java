package com.practice.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortIngUseStreams {

    public static List<Integer> lists = Arrays.asList(9,5,13,7,23,6);

    public static void ascendingStreams(){
        List<Integer> sortedList = lists.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted List: "+ sortedList);
    }

    public static void reverseSort(){
        List<Integer> reversed = lists.stream().
                sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("Reversed Sort: "+reversed);
    }

    public static void main(String[] args) {
        ascendingStreams();
        reverseSort();
    }
}
