package com.practice.streams.interview.qns;

import java.util.*;
import java.util.stream.Collectors;

public class Partition {

    public static void partition(){
        List<Integer> numbers = Arrays.asList(3, 7, 10, 15, 20, 25);
        Map<Boolean, List<Integer>> result = numbers.stream()
                .collect(Collectors.partitioningBy(n-> n%2==0,
                        Collectors.mapping(n-> n%2 ==0?n*n:n*n*n, Collectors.toList())));

        System.out.println(result);
    }

    public static void main(String[] args) {
        partition();
    }
}
