package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumber {

    private static void filterEvenNumbersUsingStream(){
        List<Integer> nums = Arrays.asList(1,4,2,6,7,13,51,63,10,12,22);
       // nums.stream().filter(n -> n%2 == 0).forEach(System.out::println); --> direct print in console
        List<Integer> evenNums = nums.stream().filter(n -> n%2 ==0).collect(Collectors.toList());
        System.out.println(evenNums);

        int[] arr = {10,15,8,49,25,98,32};
        Arrays.stream(arr).boxed().filter(n ->n%2 ==0).forEach(System.out::println);
    }

    public static void main(String[] args) {
        filterEvenNumbersUsingStream();
    }
}
