package com.practice.streams;

import java.util.Arrays;
import java.util.List;

public class SquareAndFilter {

    public static void squareAndFilter(){
        List<Integer> nums = Arrays.asList(2,3,4,5,6,7,8,9);
        nums.stream().map(n -> n*n).
                filter(n -> n <20).forEach(System.out::println);
    }

    public static void main(String[] args) {
        squareAndFilter();
    }
}
