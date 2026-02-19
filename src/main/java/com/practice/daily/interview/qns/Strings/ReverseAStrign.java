package com.practice.daily.interview.qns.Strings;

public class ReverseAStrign {

    //1. Using loop to traverse from last index
    public static void reverseAStrring(String str){
        String reversed = "";
        int lastIndx = str.length()-1;
        for(int i = lastIndx;i >=0;i--){
            reversed = reversed + str.charAt(i);
        }
        System.out.println("Reversed using loop: "+reversed);

    }

    public static void reverseUsingStringBuffer(String str){
        String rev = "";
        rev = new StringBuffer(str).reverse().toString();
        System.out.println("Reverse Using Buffer: "+rev);
    }

    public static void reverseUsingWhile(String str){
        String rev = "";
        char[] ch = str.toCharArray();
        int start = 0;
        int end = str.length()-1;
        while(start < end){
            char temp= ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end --;

        }
        System.out.println("Reverse using char Array: "+new String(ch));
    }

    public static void main(String[] args) {
        reverseAStrring("a dog");
        reverseUsingStringBuffer("hello");
        reverseUsingWhile("tree");
    }
}
