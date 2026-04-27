package com.practice.streams;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionByEven {

    public static void partitionByEven(){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        Map<Boolean, List<Integer>> partition = numbers.stream().
                   collect(Collectors.partitioningBy(n -> n%2 ==0));
        System.out.println("Partion: "+partition);

    }

    public static void main(String[] args) {
        partitionByEven();
    }
}
