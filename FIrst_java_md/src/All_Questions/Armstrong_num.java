package All_Questions;

import java.util.Scanner;

public class Armstrong_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter First num");
        int p=sc.nextInt();
        System.out.println("enter Second num");
        int r=sc.nextInt();

        arm(p,r);


    }

    static  void arm(int a,int b){
        for (int i = a+1; i <b ; i++) {
            int n=i;

            int temp=n;
            int arm=0;
            while(temp>0){
                int rem=temp%10;
                arm=arm+rem*rem*rem;

                temp=temp/10;
            }
            if (arm==n){
                System.out.println(arm);
            }


        }
    }
}
