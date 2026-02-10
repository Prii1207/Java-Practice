package com.practice.daily.interview.qns;

public class StringPallindrome {

    public static void checkPallindrome(String str){

        int start = 0;
        int end = str.length() -1;
        boolean isPallindrom = true;

        while (start < end){
            if(str.charAt(start)!= str.charAt(end)){
                isPallindrom = false;
                break;
            }
            start++;
            end--;
        }
        if(isPallindrom)
            System.out.println("Pallindrome: "+str);
        else System.out.println("Not Pallindrome: "+str);

    }

    public static void main(String[] args) {
        checkPallindrome("apple");
    }
}
