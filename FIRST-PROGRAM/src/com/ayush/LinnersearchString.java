package com.ayush;

import java.util.Arrays;

public class LinnersearchString {
    public static void main(String[] args) {

        String name="Ayush";
        char target='A';
        char[] arr=name.toCharArray();
        System.out.println(Arrays.toString(arr)
        );

      boolean a=  search(name,target);

        System.out.println(a);

       boolean b=search1(arr,target);
        System.out.println(b);
    }

    static boolean search1(char[]arr1,char traget1){
        if (arr1.length==0){
            return false;
        }
        for (char a:arr1)
        {
            if (a==traget1){
                return true;
            }
        }
        return false;
    }

    static boolean search(String str,char target){
     if(str.length()==0){
         return  false;
     }
        for (int i = 0; i <str.length() ; i++) {
            if (target==str.charAt(i)){
                return true;
            }

        }
        return false;
    }
}
