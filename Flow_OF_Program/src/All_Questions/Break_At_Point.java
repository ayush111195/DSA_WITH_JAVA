package All_Questions;

import java.util.Scanner;

public class Break_At_Point {
    public static void main(String[] args) {
        Scanner num=new Scanner(System.in);
        int sum=0;
        while (true) {
             String input=num.next();
            if (input.equals("x")){
                break;

        }
            int nums=Integer.parseInt(input);
        sum+=nums;
    }
        System.out.println(sum);

}}

