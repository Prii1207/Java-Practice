package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SquareOfDistinctEvenNumbers {

    private static void getDistinctSquaresOfEvenNumbers(){
        List<Integer> list = Arrays.asList(1,2,4,3,5,12,16,9,24,12,15,17);
        list.stream().filter(n -> n%2 ==0)
                .distinct()
                .map(n -> n*n).forEach(System.out::println);

    }

    public static void main(String[] args) {
        getDistinctSquaresOfEvenNumbers();
    }
}
