package All_Questions;

import java.util.Scanner;

public class Sum_of_number {
    public static void main(String[] args) {
        Scanner first=new Scanner(System.in);
        int First=first.nextInt();
        Scanner second=new Scanner(System.in);
        int Second=second.nextInt();

       int result=sum(First,Second);
        System.out.println(
                result
        );
    }

    static int sum(int a,int b){
        return (a+b);
    }
}
