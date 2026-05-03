
package com.practice.streams.interview.qns;

import java.util.*;
import java.util.stream.Collectors;

public class SortingAndFlatMap {

    public static void flatMapAndSorting(){

        List<List<String>> list = Arrays.asList(
                Arrays.asList("java", "api"),
                Arrays.asList("stream", "java"),
                Arrays.asList("spring", "api")
        );

        List<String> result = list.stream()
                .flatMap(List::stream)
                .distinct().sorted().collect(Collectors.toList());

        System.out.println(result);
    }

    public static void main(String[] args) {
        flatMapAndSorting();
    }
}
