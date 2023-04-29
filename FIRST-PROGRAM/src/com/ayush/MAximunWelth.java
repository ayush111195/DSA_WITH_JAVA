package com.ayush;

public class MAximunWelth {
    public static void main(String[] args) {

        int[][] accounts={
                {1,2,3,4},
                {5,6,7,8}
        };

        int result=maimunWelth(accounts);
        System.out.println(result);
    }

    static int maimunWelth(int[][]accounts){
        //row=person
        //col=account
        int ans=Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length ; person++) {
             int sum=0;
            for (int account = 0; account <accounts[person].length ; account++) {
                sum=accounts[person][account]+sum;
            }
            if (sum>ans){
                ans=sum;
            }
        }
        return ans;
    }
}
