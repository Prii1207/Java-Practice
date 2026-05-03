package com.practice.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TopN {

    public static void returnTopN(){
        List<Integer> list = Arrays.asList(1,4,23,53,66,22,77,8,42,247,2);
        int limit = 4;
        List<Integer> limittedList = list.stream().sorted(Comparator.reverseOrder()).
                limit(limit).collect(Collectors.toList());
        System.out.println("Limitted List: "+limittedList);
    }

    public static void main(String[] args) {
        returnTopN();
    }
}
