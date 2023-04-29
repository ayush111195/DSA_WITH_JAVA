package com.ayush;

public class BinariSearchOrderAgnostic {
    public static void main(String[] args) {

        int[]arr={9,8,7,6,5,4,3};
        int target=5;
      int result=  OrderAgnosticBinariSearch(arr,target);

        System.out.println(result);

    }

    static  int OrderAgnosticBinariSearch(int []arr,int target){
        int start=0;
        int end=arr.length-1;

        //find whether the array is sorted to ascending or descending ---
        boolean isasc;
        if (arr[start]<arr[end]){
            isasc=true;
        }else {
            isasc=false;
        }
        while(start<=end){
            //find thr middle element
            //  int mid=(start+end)/2;// might be possible that (start+end) exceeds the range of int in java\



            int mid=start+(end-start)/2;

            if (arr[mid]==target){
                return mid;
            }
             if (isasc) {
                 if (target < arr[mid]) {
                     end = mid - 1;
                 } else {
                     start = mid + 1;
                 }
             }
            else {
                if (target>arr[mid]){
                    end=mid-1;
                } else   {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
    }
