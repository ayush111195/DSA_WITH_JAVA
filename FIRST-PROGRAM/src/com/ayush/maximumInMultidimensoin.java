package com.ayush;

public class maximumInMultidimensoin {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3,4,5},
                {6,7,8,9},
                {10,11,12,}
        };
        int maximum=arr[0][0];

        int ans=search(arr,maximum);
        System.out.println(ans);


    }
    static  int search(int[][]arr1,int maximum){
        for (int row = 0; row < arr1.length ; row++) {
            for (int col = 0; col <arr1[row].length ; col++) {
                int target=arr1[row][col];
             if (target>maximum){
                 maximum=target;

             }
            }

        }
        return maximum;
    }
}
