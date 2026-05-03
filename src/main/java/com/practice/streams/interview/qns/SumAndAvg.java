package com.practice.streams.interview.qns;

import java.util.Arrays;
import java.util.List;

public class SumAndAvg {

    public static void sumAndAvg(){
        List<Integer> list = Arrays.asList(1,2,4,5,5,6,8);
        int sum = list.stream().mapToInt(Integer::intValue)
                .sum();
        double avg = list.stream().mapToInt(Integer::intValue).
                average().orElse(0.0);
        System.out.println("Sum: "+sum);
        System.out.println("Avg: "+avg);
    }

    public static void main(String[] args) {
        sumAndAvg();
    }
}
