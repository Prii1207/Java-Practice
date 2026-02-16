package com.practice.daily.interview.qns.arrays;

public class SecondSmallest {
    public static void getSecondSmallest(int[] arr){
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length;i++){
            if(arr[i] < smallest){ //condition 1 check smallese
                secondSmallest = smallest;
                smallest = arr[i];
            }else if(arr[i] > smallest &&
                    arr[i] < secondSmallest){ //check with second smallest
                secondSmallest = arr[i];

            }
        }
        System.out.println("Second smallest: "+secondSmallest);
    }

    public static void main(String[] args) {
        int[] arr = {1,12,5,22,6,7};
        getSecondSmallest(arr);
    }

}
