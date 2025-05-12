package com.practice.basics.logics;

public class CheckEvenOrOdd {
    public static  boolean isEven(int n){
        if(n != 0 && n%2 == 0){
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean isEvenNum = isEven(9902344);
        if(isEvenNum){
            System.out.println("It is an Even Number");
        }else{
            System.out.println("It is an Odd Number!");
        }
    }
}
