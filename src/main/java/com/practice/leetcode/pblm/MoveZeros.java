package com.practice.leetcode.pblm;

import java.util.Arrays;
import java.util.Optional;

public class MoveZeros {

    public static void moveZeroes(int[] nums){
        int k=0;
        for(int i =0;i < nums.length;i++){
            if(nums[i]!=0){
                nums[k]= nums[i];
                k++;
            }
        }

        for(int i=k ;i <nums.length;i++){
            nums[i]=0;
        }
        System.out.println("After moving zeros: "+ Arrays.toString(nums));
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }
}
