package com.ayush;

public class MinelementinArray {
    public static void main(String[] args) {

        int[]arr={12,23,45,56543,32443,4};
        int min =arr[0]; // maan liya pehle wala sabse chota h

        int result=minelement(arr,min);
        System.out.println(result);
    }
    static  int minelement(int[]arr,int min){
        for (int i = 1; i < arr.length ; i++) {
            int target=arr[i];
            if (target<min){
                min=target;
            }

        }
        return min;
    }
}
