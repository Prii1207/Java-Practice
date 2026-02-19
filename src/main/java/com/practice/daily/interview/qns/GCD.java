package com.practice.daily.interview.qns;

public class GCD {
    public static  int findGCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a %b;
            a = temp;
        }
        return a;
    }

    public static int gcdUsingRecursion(int a, int b){
        if(b == 0)
            return a;
        return gcdUsingRecursion(b, a %b);
    }

    public static void main(String[] args) {
        //int gcd = findGCD(4,16);
        int gcd = gcdUsingRecursion(56,34);
        System.out.println("GCD: "+gcd);
    }
}
