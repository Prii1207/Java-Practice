package com.practice.streams.interview.qns;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BasicFlatMap {
    public static void basicFlatMap(){
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        List<Integer> result = list.stream().flatMap(List::stream)
                .collect(Collectors.toList());
        System.out.println(result);
    }

    public static void main(String[] args) {
        basicFlatMap();
    }
}
