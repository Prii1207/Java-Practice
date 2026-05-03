package com.practice.streams.interview.qns;

import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class RemoveNonNull {

    public static void removeNullAndEmpty(){
        List<String> list = Arrays.asList("null", null, " ","", "cat ", "d og");
        List<String> nonEmpties = list.stream()
                .filter(Objects::nonNull).filter(s -> !s.trim().isEmpty()).
                collect(Collectors.toList());
        System.out.println(nonEmpties);
    }

    public static void main(String[] args) {
        removeNullAndEmpty();
    }
}
