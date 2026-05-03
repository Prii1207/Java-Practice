package com.practice.streams.interview.qns;
import java.util.*;
import java.util.stream.Collectors;

public class ListToMap {
    public static void main(String[] args) {
        List<Map<String, Object>> list = Arrays.asList(
                new HashMap<String, Object>() {{
                    put("a", 1);
                    put("b", 2);
                }},
                new HashMap<String, Object>() {{
                    put("b", 3);
                    put("c", 4);
                }}
        );

        // Values can be duplicates

        Map<String, List<Object>> result = list.stream()
                .flatMap(map -> map.entrySet().stream())
                .collect(Collectors.groupingBy(e -> e.getKey(),
                        Collectors.mapping(e-> e.getValue(), Collectors.toList())));
        System.out.println("map to list having duplicte values: "+result);

        Map<String, Object> result2 = list.stream()
                .flatMap(map-> map.entrySet().stream())
                .collect(Collectors.toMap(e-> e.getKey(),
                        e->e.getValue(),(oldVal, newVal)-> newVal
                ));
        System.out.println("Map to list resolving dupe vals: "+ result2);
    }
}
