package com.practice.basics.loops;

public class PerfectSquares {

    private static void findPerfectSquares(int startRange, int endRange){
        if ((startRange == 0 && endRange == 0) || (startRange > endRange)) {
         return;
        }else{
            int start = (int) Math.ceil(Math.sqrt(startRange));
            int end = (int) Math.floor(Math.sqrt(endRange));
            for(int i = start;i<=end; i++){
                System.out.println(i*i);
            }
        }
    }

    public static void main(String[] args) {
        findPerfectSquares(30,200);
    }

}
