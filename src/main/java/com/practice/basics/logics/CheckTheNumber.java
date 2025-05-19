package com.practice.basics.logics;

public class CheckTheNumber {
    private static void isPositiveNum(int n){
        if(n == 0){
            System.out.println("It's a Zero!"+n);
        }else if(n < 0){
            System.out.println("It's a negative Number: "+n);
        }else{
            System.out.println("It's a positive Number: "+n);
        }
    }

    public static void main(String[] args) {
        isPositiveNum(0);
    }
}
