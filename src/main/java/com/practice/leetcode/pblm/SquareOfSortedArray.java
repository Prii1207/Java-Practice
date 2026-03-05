package com.practice.leetcode.pblm;

import java.util.Arrays;

public class SquareOfSortedArray {

    private static int squares(int n){
        return  n*n;
    }

    public static int[] sortedSquares(int[] nums){
        int left=0;
        int inputSize = nums.length;
        int right = inputSize-1;
        int index = inputSize-1;
        int result[] = new int[inputSize];

        while(left <= right){
            if(squares(nums[left]) > squares(nums[right])){
                result[index]= squares(nums[left]);
                left++;
            }else{
                result[index]= squares(nums[right]);
               right--;
            }
            index--;
        }

        return result;
    }

    public static void main(String[] args) {
        int[]sortedSquareArr = sortedSquares(new int[]{-3,-2,0,2,3});
        System.out.println("Sorted arr: "+ Arrays.toString(sortedSquareArr));
    }
}
