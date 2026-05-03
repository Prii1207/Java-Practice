package com.practice.streams.interview.qns;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupTheObj {

    public static void groupTheObj(){
        List<String> list = Arrays.asList("Java", "Stream", "Code","API","Jam");
        Map<Character, List<String>> map = list.
                stream().
                collect(Collectors.groupingBy(s->s.charAt(0)));

        System.out.println(map);

    }

    public static void main(String[] args) {
        groupTheObj();

    }
}
