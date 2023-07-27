package All_Questions;

import javax.xml.stream.events.StartDocument;
import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
       int n= sc.nextInt();
        String resullt= evenorodd(n);
        System.out.println(resullt);
    }

    static String evenorodd(int n){
        if (n%2==0){
            return "even";
        }else {
            return "odd";
        }
    }
}
