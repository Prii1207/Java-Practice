package com.practice.basics.logics;

public class AreaOfCircle {

    private static double getAreaOfCircle(int radius){
        return 3.14 * radius * radius;
    }

    public static void main(String[] args) {
        double areaOfCircle = getAreaOfCircle(4);
        System.out.println("Area of Circle: "+areaOfCircle+"sq m");
    }
}
