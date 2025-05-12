package com.practice.basics.logics;

public class MaxOfThreeNumbers {
    public int getMaxNum(int a, int b, int c){
        if((a > b) && (a > c)){
            return a;
        }else if (b > c){
            return b;
        }else{
            return c;
        }
    }

    public int getMaxbyBuiltIn(int x, int y,int z){
     return Math.max(x,y);
    }

    public static void main(String[] args) {
        MaxOfThreeNumbers maxOfThreeNumbers = new MaxOfThreeNumbers();
        int maxNum = maxOfThreeNumbers.getMaxNum(34,64,20);
        System.out.println(maxNum);
    }
}
