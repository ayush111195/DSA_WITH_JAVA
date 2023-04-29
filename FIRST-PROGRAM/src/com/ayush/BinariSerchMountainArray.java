package com.ayush;

public class BinariSerchMountainArray {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 6, 5, 4, 3, 2, 1};
     // System.out.println(arr.length);

        int result=mountain(arr);
        System.out.println(result);
    }

    static  int mountain (int [] arr){
        int ans = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i + 1] < arr[i]) {
                ans = i;
                break;
            }
        }
    return ans;
    }
}
