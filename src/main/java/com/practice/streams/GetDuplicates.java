package com.practice.streams;

import java.util.HashSet;
import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class GetDuplicates {
    private static List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);

    private static void getDuplicates(){
        Set<Integer> distincts = new HashSet<>();
        myList.stream().filter(n -> !distincts.add(n)).forEach(System.out::println);
    }

    public static void main(String[] args) {
        getDuplicates();
    }
}
