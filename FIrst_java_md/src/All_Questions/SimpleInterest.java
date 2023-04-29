package All_Questions;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();

        int result=interst(p,r,t);
        System.out.println(result);
    }

    static  int interst(int p ,int r ,int t){
        return p*(1+(r*t));
    }
}
