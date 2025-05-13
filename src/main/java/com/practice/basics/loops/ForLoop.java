package com.practice.basics.loops;

public class ForLoop {
    public static void basicForLoop(int n){
        for(int i=1;i<=n;i++){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        basicForLoop(100);
    }
}
