package com.ayush;

public class Findthenumberofdigit {
    public static void main(String[] args) {
        int num=212423;
        int ans= (int) (Math.log10(num)+1);
        System.out.println(ans);
    }
}
