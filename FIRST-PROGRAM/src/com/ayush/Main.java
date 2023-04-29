package com.ayush;

public class Main {
    public static void main(String[] args) {

        int[]arr= {12,13,14,15,16,17,18};
        int max=arr[0];/// maan liya ki sabse bda 0th element h

        int result = maxmimum( arr, max);

        System.out.println( result);
    }

    static  int maxmimum( int[] arr,int max){
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>max){
                max=arr[i];

            }

        }
        return max;
    }
}
