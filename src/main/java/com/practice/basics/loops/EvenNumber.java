package com.practice.basics.loops;

public class EvenNumber {
    public static void getEvenNumberBtwnrange(int a, int b){
        for(int i=a;i<=b;i++){
            if(i%2 ==0){
                System.out.print(i+"\t");
            }
        }
    }

    public static void main(String[] args) {
        getEvenNumberBtwnrange(1,50);
    }
}
