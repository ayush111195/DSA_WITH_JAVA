package com.ayush;

import java.util.Scanner;

public class prime {
 public static void main(String[]args){

  Scanner in=new Scanner(System.in);
 int n= in.nextInt();
 int temp=0;

 if (n==0||n==1){
  System.out.println("NUmber is not prime ");
 }
 else if (n==2){
  System.out.println("number is prime ");
 }
 else {
  for (int i =2 ;  i<=n-1;i++){
   if (n%i==0){
    temp+=1;}}

    if (temp>=1){
     System.out.println("this is not prime number ");

   }
    else {
     System.out.println("this is prime");
    }

 }


 }
}
