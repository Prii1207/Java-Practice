package com.practice.leetcode.pblm;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target){
        int arrLength = nums.length;
        for(int i =0;i<arrLength;i++){
            for(int j= i+1;j< arrLength;j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
return new int[]{};
    }

    public static void main(String[] args) {
        int res[]= new int[2];
        res = twoSum(new int[]{2,7,11,15},13);
        System.out.println("Result: "+ Arrays.toString(res));

    }
}
