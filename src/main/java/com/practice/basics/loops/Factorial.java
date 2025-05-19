package com.practice.basics.loops;

public class Factorial {
    static int getFactorial(int num){
        int fact =1;
        for(int i=1; i<=num;i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int factorial = getFactorial(8);
        System.out.println(factorial);
    }
}
