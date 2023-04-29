package com.ayush;

import java.util.Arrays;

public class LinnerSearchInMultidimensoin {
    public static void main(String[] args) {

        int[][] arr={
                {1,2,3,4,5},
                {6,7,8,9},
                {10,11,12,}
        };
        int target=7;

      int[] ans=  serach(arr,target);
        System.out.println(Arrays.toString(ans));

    }
    static int[] serach(int [][] arr1,int target1){
        for (int row = 0; row < arr1.length ; row++) {
            for (int col = 0; col <arr1[row].length ; col++) {
                if (target1==arr1[row][col]){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
