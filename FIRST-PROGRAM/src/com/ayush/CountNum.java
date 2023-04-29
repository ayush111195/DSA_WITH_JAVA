package com.ayush;

public class CountNum {
    public static void main(String[] args) {
        int n=234523365;

        int count=0;

     /*   while (n>0){
            int rem=n%10;
            if(rem==5){
                count++;
            }
            n=n/10;;
        }
        System.out.println(count); */

        for (int i =0;n>0;i++ ){
            int rem=n%10;
            if (rem==5){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
    }
}
