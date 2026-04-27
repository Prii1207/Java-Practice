package com.practice.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByFirstChar {

    public static void groupByFirstChar(){
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Brian", "Ankit");
        Map<Character, List<String >> group = names.stream().
                collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println("Grouped Map: "+group);
    }

    public static void main(String[] args) {
        groupByFirstChar();
    }
}
