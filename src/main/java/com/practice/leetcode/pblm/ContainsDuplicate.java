package com.practice.leetcode.pblm;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        boolean isDuplicate = containsDuplicate(new int[]{1,2,3,4,1});
        System.out.println("Is Duplicate: "+isDuplicate);
    }
}
