package com.practice.streams.interview.qns;

import java.util.*;
import java.util.stream.Collectors;

public class EvenAndCollect {

    public static void evenAndCollect(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> evenList = list.stream().filter(n -> n%2 ==0).collect(Collectors.toList());
        System.out.println(evenList);
        int sumOfEvens = evenList.stream()
                .reduce(0,(a,b)-> a+b);
        System.out.println("sum of evens: "+sumOfEvens);
        int productOfAll = list.stream()
                .reduce(1, (a,b) -> (a*b));
        System.out.println("Product of all nums: "+productOfAll);
    }

    public static void main(String[] args) {
        evenAndCollect();
    }
}
