package com.ayush;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayFunction {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in );
        int[]num={1,2,3,4,5,6};

        change ( num);

        System.out.println(Arrays.toString(num));
    }

    static  void  change ( int [] arr1){
        arr1[1]=99;
    }
}
