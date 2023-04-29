package com.ayush;

public class EvendigitinArray {
    public static void main(String[] args) {

        int[] num={12,345,2,6,7896};
     int ans=   findNummbers(num);
        System.out.println(ans);



    }

    static  int findNummbers(int[]nums){
        int count=0;
        for (int num :nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
     //function tocheck whether a number contains even digits or not
     static boolean even(int num) {
        int nuberofDigits =digits(num);
        if (nuberofDigits%2==0){
            return  true;
        }
        return false;
    }
    //count nuber of digits in a number
    static int digits(int num){
        int count=0;
        while (num>0){
            count++;
            num=num/10;
        }
        return count;
    }
}
