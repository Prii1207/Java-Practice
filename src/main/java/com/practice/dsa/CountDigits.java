package com.practice.dsa;

public class CountDigits {
    public int countDigit(int n) {
        long num = Math.abs((long) n);

        int count = 0;
        while(num >0){
            count++;
            num /= 10;
        }
        return count;
    }

    public static void main(String[] args) {
CountDigits obj = new CountDigits();
int count = obj.countDigit(-12337);
System.out.println("Count: "+count);
    }
}
