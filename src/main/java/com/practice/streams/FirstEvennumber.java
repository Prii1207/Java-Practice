package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstEvennumber {

    public static void firstEvenNum(){
        List<Integer> lists = Arrays.asList(1,2,3,6,8,5);

       int firstEven = lists.stream().
                filter(n -> n%2 ==0).findFirst().orElse(-1);
       System.out.println("First Even: "+firstEven);
    }

    public static void main(String[] args) {
        firstEvenNum();
    }
}
