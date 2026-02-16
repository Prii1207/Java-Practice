package com.practice.daily.interview.qns;

public class ReminderWithoutModulus {

    public static void reminder(int a, int b){
     int quotient = a/b;
     int remininder = a - (quotient*b);
     System.out.println("REMINDER WITHOUT MODULUS: "+ remininder);
    }

    public static void noOperators(int a, int b){
        while(a >=b){
            a = a-b;
        }
        System.out.println("Reminder: "+a);
    }

    public static void main(String[] args) {
        reminder(16,3);
        noOperators(34,5);
    }
}
