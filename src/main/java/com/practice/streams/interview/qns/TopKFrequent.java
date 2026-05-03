package com.practice.streams.interview.qns;

import java.util.*;
import java.util.stream.Collectors;

public class TopKFrequent {

    public static void topKFrequent(){
        List<String> words = Arrays.asList(
                "java", "api", "java", "stream", "api", "java", "spring"
        );
        List<String> frequents = words.stream().
                collect(Collectors.groupingBy(n->n, Collectors.counting())).entrySet()
                .stream().sorted((a,b)-> Long.compare(a.getValue(), b.getValue())).
                limit(2).map(e-> e.getKey())
                .collect(Collectors.toList());
        System.out.println(frequents);
    }

    public static void main(String[] args) {
        topKFrequent();
    }
}
