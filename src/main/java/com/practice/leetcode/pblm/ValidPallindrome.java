package com.practice.leetcode.pblm;

public class ValidPallindrome {

    public static void isValidPalindrome(String s){
        boolean isPallindrome = false;
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            while(left < right &&
            !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }

            while(left < right &&
                    !Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }

            if(s.charAt(left) == s.charAt(right)){
                isPallindrome = true;
            }
            left++;
            right--;


        }

        System.out.println("Is Pallindrome: "+isPallindrome);
    }

    public static void main(String[] args) {
        isValidPalindrome("A man, a plan, a canal: Panamal");
    }
}
