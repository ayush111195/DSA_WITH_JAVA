package com.ayush;

public class minimumInMultidimensoin {



        public static void main(String[] args) {
            int[][] arr={
                    {1,2,3,4,5},
                    {6,7,8,9},
                    {10,11,12,}
            };
            int minimum=arr[0][0];

            int ans=search(arr,minimum);
            System.out.println(ans);


        }
        static  int search(int[][]arr1,int minimum1){
            for (int row = 0; row < arr1.length ; row++) {
                for (int col = 0; col <arr1[row].length ; col++) {
                    int target=arr1[row][col];
                    if (target<minimum1){
                        minimum1=target;

                    }
                }

            }
            return minimum1;
        }
    }

