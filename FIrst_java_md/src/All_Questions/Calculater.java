package All_Questions;

import java.util.Scanner;

public class Calculater {
    public static void main(String[] args) {

        calculater();
    }

    static void calculater() {
        while (true) {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a");
           int  a= sc.nextInt();
            System.out.println("enter b");
            int  b= sc.nextInt();
            System.out.println("enter oprater");
            String  oprater= sc.next();

            if (oprater.equals("+")) {
                System.out.println(a + b);

            } else if (oprater .equals("-")) {
                System.out.println(a - b);

            } else if (oprater.equals("*")) {
                System.out.println(a * b);

            } else if (oprater.equals("/")) {
                System.out.println(a / b);
            } else {
                System.out.println("Enter a valid oprater");
            }

        }
    }
}