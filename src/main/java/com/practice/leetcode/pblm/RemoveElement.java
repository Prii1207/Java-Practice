package com.practice.leetcode.pblm;

public class RemoveElement {

    public static int removeDuplicates(int []nums, int target){
         int len = nums.length;
         int k=0;
         for(int i=0; i < len;i++){
             if(nums[i]!=target){
                 nums[k]= nums[i];
                 k++;
             }
         }
        return k;
    }

    public static void main(String[] args) {
        int remainingLength = removeDuplicates(new int[]{3,2,3,2,5}, 3);
        System.out.println(remainingLength);
    }
}
