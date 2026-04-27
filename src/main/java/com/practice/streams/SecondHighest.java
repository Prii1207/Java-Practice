package com.practice.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SecondHighest {

   static List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50, 40);

    public static int getSecondHighest(List<Integer> list){
        Integer secondHighest = numbers.stream().distinct().
                sorted(Comparator.reverseOrder()).skip(1).
                findFirst().orElse(null);
        return secondHighest;
    }

    public static void main(String[] args) {
        int secondHighest = (int) getSecondHighest(numbers);

        System.out.println("second highest: "+secondHighest);
    }
}
