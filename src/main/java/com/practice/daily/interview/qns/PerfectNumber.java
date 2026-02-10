package com.practice.daily.interview.qns;

public class PerfectNumber {

    public static void perfectNumber(int n){
        if (n <= 1) {
            System.out.println("Not Perfect number! " + n);
        return;
        }

        int sum = 1;
        for(int i= 2;i <=n/2;i++){
            if(n%i == 0){
                sum += i; // Add the factor factor -> reminder is 0
            }
        }
        if(sum == n){
            System.out.println("Perfect Number! "+n);

        }else {
            System.out.println("Not Perfect Number! " + n);
        }
    }

    public static void perfectNumberTillN(int num){
        for(int n =1; n <= num;n++){
            if (n <= 1) {
                System.out.println("Not Perfect number! " + n);
                continue;
            }
            int sum = 1;
            for(int i= 2;i <=n/2;i++){
                if(n%i == 0){
                    sum += i; // Add the factor factor -> reminder is 0
                }
            }
            if(sum == n){
                System.out.println("Perfect Number! "+n);

            }else {
                System.out.println("Not Perfect Number! " + n);
            }
        }

    }

    public static void main(String[] args) {
        //perfectNumber(28);
        perfectNumberTillN(12);
    }
}
