package com.practice.daily.interview.qns;

public class ArmStrongNumber {
    public static void isArmStron(int num){
        int temp = num;
        int noOfDigits =0; // count of num
        int sum = 0; // to be chec with original num


        //1. Check Digit counts
        while( temp != 0){
            noOfDigits++;
            temp /=10;
        }

        temp = num; //temp become 0 restor the original
        while(temp >0){
            int eachDigit = temp %10; //extract each digit
            int power = 1;
            for(int i=1;i<= noOfDigits;i++){
                power = power * eachDigit;
            }
            sum += power;
            temp /=10;
        }

        if(sum == num)
            System.out.println("ArmStrong Num: "+num);
        else System.out.println("Not ArmStrong Num: "+num);
    }

    public static void main(String[] args) {
        isArmStron(153);
    }
}
