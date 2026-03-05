package com.practice.leetcode.pblm;

public class PallindromeNumber {

    public static boolean isPallindrome(int num){
        if(num < 0)
            return false;

        boolean isPallindrome = false;
        int rev=0;
        int x = num;
        while(x!= 0){
            int digit = x%10;
            rev = rev*10+digit;
            x /=10;

        }
        if(rev == num)
            return true;
        else return false;

    }

    public static void main(String[] args) {
        System.out.println(isPallindrome(464));
    }
}
