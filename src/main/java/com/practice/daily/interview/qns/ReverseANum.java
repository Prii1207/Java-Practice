package com.practice.daily.interview.qns;

import java.util.function.DoubleToIntFunction;

public class ReverseANum {
    public static int reverseAnum(int num){
        num = Math.abs(num);
        int rev = 0;
        while(num !=0){
            int temp = num%10;
            rev = rev*10+temp;
            num /=10;
        }
        return rev;
    }

    public static void main(String[] args) {
        int reverse = reverseAnum(-432);
        System.out.println("Reverse: "+reverse);
    } //if rev== original then pallindrom
}
