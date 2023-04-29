package All_Questions;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rupees");
        int a=sc.nextInt();
        double result=conersion(a);
        System.out.println(result+" usd");
    }
    static double conersion(int a  ){

        return  (a*0.012);
    }
}
