package All_Questions;

import java.util.Scanner;

public class Lcm_Hcf {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        int a=n.nextInt();
        int b=n.nextInt();
        int result=lcm(a,b);
        System.out.println("lcm="+result);

        int result2=hcf(a,b);
        System.out.println("hcf="+result2);
    }

    static int lcm(int a,int b){
        int x=0;
        for (int i = 1; i>0 ; i++) {
            if (i%a==0&&i%b==0){
                x=i;
                break;
            }
        }
        return x;
    }

    static  int hcf(int a ,int b){

        int hcf=(a*b)/lcm(a,b);

        return hcf;
    }

}
