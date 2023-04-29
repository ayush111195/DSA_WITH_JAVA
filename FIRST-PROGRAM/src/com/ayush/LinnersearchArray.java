package com.ayush;

public class LinnersearchArray {
    public static void main(String[] args) {

        int[] arr={12,13,16,1788,7233};
        int target =16;

      int result =  linnerserch( arr,target);
        System.out.println(result);
    }
    static  int linnerserch( int[] arr1, int target){
        if (arr1.length==0){
            return  -1;
        }
        for (int index = 0; index < arr1.length ; index++) {
            int temp=arr1[index];
            if (temp==target){
                return index;
            }

        }
        return -1;
    }
}
