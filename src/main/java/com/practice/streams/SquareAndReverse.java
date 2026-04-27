package com.practice.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SquareAndReverse {

    public static void squareAndReverse(){
        List<Integer> nums = Arrays.asList(2,3,4,5,6,7,8,9);

        List<Integer>reversedSquares = nums.stream().map(n -> n*n).
                sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println("Squared and reversed: "+reversedSquares);

    }

    public static void main(String[] args) {
        squareAndReverse();
    }
}
