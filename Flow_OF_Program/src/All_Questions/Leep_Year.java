package All_Questions;

import java.util.Scanner;

public class Leep_Year {
    public static void main(String[] args) {
        Scanner yaer=new Scanner(System.in);
        int year=yaer.nextInt();
        System.out.println(
                leep(year)
        );
    }

    static boolean leep(int yaer){
        if (yaer%4==0) {
            return true;
        }
        return  false;
    }
}
