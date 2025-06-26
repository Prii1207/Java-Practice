package com.practice.dsa;

import java.util.Arrays;

public class LinearSearch {
    private static int LinearSearch(int [] arrayOfNum, int targetNum){
        for(int i = 0; i < arrayOfNum.length; i++){
            if(arrayOfNum[i] == targetNum){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrayOfNum = {1,2,3,4,5,6,7};
        int target = 3;
      int targetElementIndx =  LinearSearch(arrayOfNum,target);
      System.out.println("Element "+target+" found at index: "+targetElementIndx);
    }

}
