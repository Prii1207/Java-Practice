package com.practice.basics.logics;

public class LeapYear {
    public static void checkLeapYear(int year){
        if(year != 0){
            if(year % 4 ==0){
                System.out.println("It's a Leap Year: "+year);
            }else{
                System.out.println("It's not a Leap Year: "+year);
            }
        }
    }

    public static void main(String[] args) {
        checkLeapYear(2035);
    }
}
