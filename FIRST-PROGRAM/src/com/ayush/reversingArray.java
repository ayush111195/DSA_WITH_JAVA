package com.ayush;

import java.util.Arrays;

public class reversingArray {
    public static void main(String[] args) {


        int[] arr = {12, 13, 1, 56, 4, 3, 23, 2, 2, 23};
        // print the number in revers order
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.println(arr[i]);
        }

        revverse(arr);

        System.out.println(Arrays.toString(arr));
    }

    static void revverse(int[]arr1){
        for (int i = 0; i < arr1.length/2 ; i++) {
            int temp=arr1[i];
            arr1[i]=arr1[arr1.length-i-1];
            arr1[arr1.length-i-1]=temp;
        }
    }


}
