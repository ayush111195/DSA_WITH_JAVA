package com.ayush;

public class BinariSearch {
    public static void main(String[] args) {

        int []arr={12,13,14,15,16,17,18,19,20};
        int target=12;
        int result=binarysearch(arr,target);
        System.out.println(result);
    }
        static int binarysearch(int[]arr , int target) {

        int start=0;
        int end=arr.length-1;
         while(start<=end){
             //find thr middle element
           //  int mid=(start+end)/2;// might be possible that (start+end) exceeds the range of int in java
             int mid=start+(end-start)/2;

             if (target<arr[mid]){
                 end=mid-1;
             } else if (target>arr[mid]) {
                 start=mid+1;
             }else {
                 return mid;
             }
         }
            return -1;
        }
    }


