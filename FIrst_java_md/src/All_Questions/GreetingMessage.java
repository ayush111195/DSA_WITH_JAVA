package All_Questions;

import java.util.Scanner;

public class GreetingMessage {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        msg(name);
    }

    static void msg(String name){
        System.out.println("welcome "+name);
    }
}
