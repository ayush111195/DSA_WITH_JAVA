package com.ayush;

public class BinariSearchsmallestLetterGreaterThanTarget {

    public static void main(String[] args) {
       // the latter warped arround ---

       char[]arr={'c','f','j'};

       char target='j';

     char result=   nextGraterLetter(arr,target);

        System.out.println(result);
    }

    static   char nextGraterLetter(char[]letter,char target){
        int start=0;
        int end=letter.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;
        if (target<letter[mid]){
            end=mid+1;
        }else {
            start=mid+1;
        }
        }
        return letter[start%letter.length];
    }
}
