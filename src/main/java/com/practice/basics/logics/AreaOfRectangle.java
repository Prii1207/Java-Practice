package com.practice.basics.logics;

public class AreaOfRectangle {
    public static int calculateArea(int length, int breadth){
        return length * breadth;
    }

    public static void main(String[] args) {
        int area = calculateArea(34, 56);
        System.out.println(area+"sq meters");
    }
}
