package com.practice.daily.interview.qns;

public class BitwiseOperations {

     public static int addUsingBitwise(int a,int b){
         if(a==0)
             return b;
         else if (b == 0) {
             return a;
         }else{
             while(b !=0) {
                 int carry = a & b;
                 a = a ^ b;
                 b = carry << 1;
             }
             return a;
         }
     }

     public static int subUsingBitwise(int a,int b){
         if(a==0)
             return b;
         else if (b == 0) {
             return a;
         }else{
             while(b !=0) {
                 int borrow =(~a) & b;
                 a = a ^ b;
                 b = borrow << 1;
             }
             return a;
         }
     }

    public static void main(String[] args) {
        int sum = addUsingBitwise(7,23);
        System.out.println("Sum: "+sum);

        int diff = subUsingBitwise(5,2);
        System.out.println("Diff: "+diff);
    }
}
