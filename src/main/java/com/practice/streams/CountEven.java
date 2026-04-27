package com.practice.streams;

import java.util.Arrays;
import java.util.List;

public class CountEven {

    public static void countEven(){
        List<Integer> lists = Arrays.asList(1,3,4,6,7,8,12,16,18);
        long count = lists.stream().filter(n -> n%2 ==0).count();
        int evenCount = (int)count;
        System.out.println("Even Count: "+evenCount);
    }

    public static void main(String[] args) {
        countEven();
    }
}
