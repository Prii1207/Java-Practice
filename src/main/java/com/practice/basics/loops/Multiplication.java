package com.practice.basics.loops;

public class Multiplication {
    public static void printMultiplicationTables(int num){
        if(num != 0) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + "x" + i + "="+num * i);
            }
        }
    }

    public static void main(String[] args) {
        printMultiplicationTables(3);
    }
}
