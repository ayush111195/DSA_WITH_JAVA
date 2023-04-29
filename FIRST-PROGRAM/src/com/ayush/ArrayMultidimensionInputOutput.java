package com.ayush;

import java.util.Arrays;
import java.util.Scanner;

class MultidimensionArrayInputOutput {

    public static void main(String[] args) {

        int[][] arr = new int[3][2];

        int [][] arr1=new  int[3][3];

        inputoutput(arr);

        inputoutput(arr1);

    }

    static void inputoutput( int[][] arr)

    {

        Scanner  in=new Scanner( System.in);
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {

                arr[row][col] = in.nextInt();

            }

        }
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        // output using to string method --

        for (int row = 0; row < arr.length ; row++) {
            System.out.println(Arrays.toString(arr[row]));

        }

        // output using for-each loops ---

        for (int[] a :arr){
            System.out.println(Arrays.toString(a));
        }

    }
}


