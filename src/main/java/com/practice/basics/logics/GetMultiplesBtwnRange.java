package com.practice.basics.logics;

public class GetMultiplesBtwnRange {

    public  static void getRangeForNum(int num){
        if(num != 0){
            for(int i =1; i<=100;i++){
                if(i%num ==0){
                    System.out.print(i+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        getRangeForNum(8);
    }
}
