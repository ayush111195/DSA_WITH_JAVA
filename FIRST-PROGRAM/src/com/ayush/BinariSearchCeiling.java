package com.ayush;

public class BinariSearchCeiling {
    public static void main(String[]args){

        int []arr={12,13,14,16,17,18,19,20};

        int target=15;

     int result=   ceiling(arr,target);
        System.out.println(result);
    }
    static  int ceiling(int[]arr,int tarrget){

        // but what if the target is greater than the grater than the greatest number in array
        if (tarrget>arr.length-1){
            return -1;
        }
        int start=0;
        int end=arr.length-1;
        boolean assin;
        if (arr[end]>=arr[start]){

                    assin=true;

        }else {
            assin=false;
        }
        while (start<=end){
            int mid=start+(end-start)/2;
              if (tarrget==mid){
                  return mid;
              }
            if (assin){
                if (tarrget>arr[mid]){
                    start=mid+1;
                }else {
                    end=mid-1;
                }
            }else {
                if (tarrget>arr[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return start;
    }
}
