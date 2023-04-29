package All_Questions;

import java.util.Scanner;

public class Multipication_Table {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int N=n.nextInt();
        table(N);    }

    static void table(int n){

        for (int i = 0; i <=10 ; i++) {
            System.out.println((n*i));
        }
    }
}