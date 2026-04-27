package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlattenLists {
public static void flatList(){
    List<List<Integer>> listOfLists = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5),
            Arrays.asList(6, 7, 8)
    );

    List<Integer> flatList = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
    System.out.println("Flat List: "+flatList);
}

    public static void main(String[] args) {
        flatList();
    }
}
