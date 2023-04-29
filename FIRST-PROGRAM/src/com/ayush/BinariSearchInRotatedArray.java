package com.ayush;

public class BinariSearchInRotatedArray {
    public static void main(String[] args) {
        int[]arr={4,5,6,7,0,1,2};
        int target=6;

        int result=search(arr,target);
        System.out.println(result);
    }

    static  int search(int []nums,int target){
        int pivot=findPivot(nums);
        //if you dont find the pivot , it means the arry is not rotaed
        if(pivot==-1){
            //just do normal binary search
            return binarysearch(nums,target,0,nums.length-1);
        }
       // if piot is found ,you have found 2 asc shorted arrays

       if(nums[pivot]==target){
           return pivot;
       }
       if (target>=nums[0]){
           return binarysearch(nums,target,0,pivot-1);
       }else {
           return binarysearch(nums,target,pivot+1,nums.length-1);
       }
    }

    static int binarysearch(int[]arr , int target,int start,int end) {


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

    static  int findPivot(int[]arr){
        int start=0;
        int end= arr.length-1;
        while (start<=end){

            int mid=start+(end-start)/2;
            //4 case over here
            if (mid<end&&arr[mid]>arr[mid+1]){
                return mid;
            }
            if (mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (arr[mid]<=arr[start]){
                end=mid-1;
            }else {
                start=mid+1;
            }
        }
        return -1;
    }
}
