package com.ayush;

import java.util.Arrays;

public class swapnumberArray {

    public static void main(String[] args) {

        int []arr={3,4,6,8,3,4,6};
        swap( arr , 0 ,6);
        System.out.println(Arrays.toString(arr));
    }

    static void swap( int[]arr1 , int index ,int index2){

        int temp=arr1[index];
        arr1[index]=arr1[index2];
        arr1[index2]=temp;
    }
}
