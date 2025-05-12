package com.practice.basics.logics;

public class SwapTwoVariables {
    public void swap(String a, String b){
        System.out.println("---Before Swapping---");
        System.out.println("A: " +a);
        System.out.println("B: "+ b);
        String temp = a;
        a = b;
        b = temp;
        System.out.println("---After Swapping---");
        System.out.println("A: "+a);
        System.out.println("B: "+b);
    }

    public static void main(String[] args) {
        SwapTwoVariables swapTwoVariables = new SwapTwoVariables();
                swapTwoVariables.swap("Apple", "Banana");
    }
}
