package com.practice.daily.interview.qns;

public class PrimeNumber {

    public static void isBoolean(int num){
        for(int i=2;i*i <=num;i++){
            if(num%i == 0){
                System.out.println("not prime: "+num);
                return;
            }
        }
        System.out.println("Prime: "+num);
    }

    public static void main(String[] args) {
        isBoolean(56);
    }
}
