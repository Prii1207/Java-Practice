package com.practice.daily.interview.qns;

public class StrongNumber {

    public static void strongNumber(int n){
        if(n < 1)
            return;
        int sum = 0;
        int temp = n;

        while (temp !=0){
            int eachDigit = temp %10; //get each digit
            int fact = 1;
            for(int i =0;i<= eachDigit;i++){ //get factorial till the value
                fact *= i;
            }
            sum += fact;
            temp /=10;
        }
        if(sum ==n)
            System.out.println("Strong Num: "+n);
        else  System.out.println("Not Strong Num: "+n);
    }


    public static void strongNumberTilN(int num){
        for(int n=1;n <= num;n++){
        int sum = 0;
        int temp = n;

        while (temp !=0){
            int eachDigit = temp %10; //get each digit
            int fact = 1;
            for(int i =0;i<= eachDigit;i++){ //get factorial till the value
                fact *= i;
            }
            sum += fact;
            temp /=10;
        }
        if(sum ==n)
            System.out.println("Strong Num: "+n);
        else  System.out.println("Not Strong Num: "+n);
    }}

    public static void main(String[] args) {
        //strongNumber(145);
        strongNumberTilN(20);
    }
}
