package com.ayush;

public class Armstrongnumber {
    public static void main(String[] args) {
        int n=154;

        int temp=n;
        int arm=0;
        while(temp>0){
            int rem=temp%10;
            arm=arm+rem*rem*rem;

            temp=temp/10;
        }
        if (arm==n){
            System.out.println("armstrong number ");
        }
        else {
            System.out.println("not a armstrong number ");
        }

    }
}
