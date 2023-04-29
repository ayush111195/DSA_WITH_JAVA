package com.ayush;

import java.util.Arrays;

public class BinarySearchFindFirstAndLastPositionOfElement {
    public static void main(String[] args) {
        int arr []={5,7,7,7,7,7,8,8,9};

        int target=7;
      int[]  result=  positionOFElement(arr,target);
        System.out.println(Arrays.toString(result));
    }

    static int[] positionOFElement(int[]arr,int target){
         int start=0;
         int end= arr.length-1;

        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i]==target){
                start=i;
             break;
            }
        }
        for (int j = arr.length-1; j >=0 ; j--) {

            if (arr[j]==target){
                end=j;
                break;

            }
        }

        return new int[]{start,end} ;
    }
}
