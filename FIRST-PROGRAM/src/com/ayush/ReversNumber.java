package com.ayush;

public class ReversNumber {
    public static void main(String[] args) {

        int n=23594;
        int ans=0;

        while (n>0){
          int rem=n%10;


        ans=ans*10+rem;
            n=n/10;

        }
        System.out.println(ans);
    }
}
