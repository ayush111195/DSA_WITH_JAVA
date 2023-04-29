package com.ayush;

import java.util.Arrays;

public class BinarySearchFindFirstAndLastPositionOfElementSecondMethod {
    public static void main(String[] args) {

        int[] num={5,7,7,8,8,10};

        int target=8;

     int [] result=   searchRange(num,target);

        System.out.println(Arrays.toString(result));


    }

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};

        //check for  first occurrence if target first

      int start=  search(nums,target,true);

        int end=  search(nums,target,false);

        ans[0]=start;

        ans[1]=end;

        return ans;
    }



    //this function just return the index value of target
   public static int search(int[] nums, int target, boolean findstartindex) {
        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                //potential ans found
                ans=mid;
                if (findstartindex){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
