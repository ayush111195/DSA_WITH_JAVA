package All_Questions;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n");
        int a=sc.nextInt();
        febo(a);
    }

    static  void febo(int n){
        int count=2;
        int a=0;
        int b=1;

        while (count<=n){
            int temp=b;
            b=a+b;
            a=temp;
            count++;
            System.out.println(b);
        }

    }
}
