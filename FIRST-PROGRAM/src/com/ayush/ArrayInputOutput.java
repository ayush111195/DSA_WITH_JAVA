package com.ayush;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {


        // input a array

        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length ; i++) {
            arr[i]=in.nextInt();
        }

        // output a arrys using for loops

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }

        // output using for each loops
        for(int a:arr){
            System.out.println(a);
        }


        //output using to string method --

        System.out.println(Arrays.toString(arr));
    }


}