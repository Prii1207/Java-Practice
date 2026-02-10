package com.practice.daily.interview.qns;

public class SumOfNumbers {

    public static void calculateSumOfNumbers(int num){
        if (num < 1 ){
            System.out.println("Invalid Num");
            return;
        }
        int sum = 0;
        while(num > 0){
            int digit = num %10;
            sum += digit;
            num /=10;
        }
        System.out.println("Sum of num: "+sum+"For the num: "+num);
    }

    public static void main(String[] args) {
        calculateSumOfNumbers(453);
    }
}
