package com.practice.streams.interview.qns;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class ParallelStreamExample {
  static  List<Integer> list = Arrays.asList(1,3,4,5,6,7,8);

    public static void sharedMutableStateExample(){
        List<Integer> list = Arrays.asList(1,3,4,5,6,7,8);
        List<Integer> result = new ArrayList<Integer>();
        list.parallelStream().forEach(result::add);
        System.out.println(result);

    }

    public static void basicPeekAndMap(){
       /** list.stream()
                .filter(x -> x > 2)
                .peek(x -> System.out.println("After filter: " + x))
                .map(x -> x * 2)
                .peek(x -> System.out.println("After map: " + x))
                .collect(Collectors.toList()); **/
        list.parallelStream()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        //sharedMutableStateExample();
        basicPeekAndMap()
;    }
}
