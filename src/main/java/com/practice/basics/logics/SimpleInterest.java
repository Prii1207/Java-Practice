package com.practice.basics.logics;

public class SimpleInterest {

    private  static int getSimpleInterset(int principalAmnt, int time, int rateOfInterest){
        int si = (principalAmnt * time * rateOfInterest)/100;
        return  si;
    }

    public static void main(String[] args) {
       int simpleInterset = getSimpleInterset(5000,4,3);
        System.out.println(simpleInterset);
    }
}
