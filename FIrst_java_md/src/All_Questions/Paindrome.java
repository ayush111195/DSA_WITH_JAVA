package All_Questions;

import java.util.Scanner;

public class Paindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your series");
        String series=sc.next();
        boolean result=paindrom(series);
        System.out.println(result);
    }
    static boolean paindrom(String series){
        int i=0;
        int j=series.length()-1;
        while (i<j) {


            if (series.charAt(i) == series.charAt(j)) {
                return true;

            }
            i++;
            j--;
        }return false;
}
}
