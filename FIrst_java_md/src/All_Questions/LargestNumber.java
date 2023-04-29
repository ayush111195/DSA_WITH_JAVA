package All_Questions;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a");
        int a=sc.nextInt();
        System.out.println("ENter b ");
        int b =sc.nextInt();
        largest(a,b);
    }

    static  void largest(int a, int b){
        if (a>b){
            System.out.println("a is largest");
        }else if (a==b){
            System.out.println("both are equle");
        }else {
            System.out.println("b is largest");
        }
    }
}
