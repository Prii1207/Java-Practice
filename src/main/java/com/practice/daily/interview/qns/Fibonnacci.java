package com.practice.daily.interview.qns;

public class Fibonnacci{

    public static void getFibonnacciSeriesForRange(int n){
        int a = 0,b =1;
        for(int i=0;i <n;i++){
            System.out.print(a+" ");
            int next = a+b;
            a = b;
            b = next;
        }
    }

    public static int getFibonnacciForPosition(int n){
        int a = 0,b =1;
        for(int i=0;i <n;i++){
            System.out.print(a+" ");
            int next = a+b;
            a = b;
            b = next;
        }
        return b;

    }

    public static void main(String[] args) {
        getFibonnacciSeriesForRange(10);
    //  int nThFibonacci = getFibonnacciForPosition(12);
    //  System.out.println("Nth Fibonacci: "+nThFibonacci);
    }



    }


