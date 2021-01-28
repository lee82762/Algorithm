package DP.거스름돈;

import java.util.Scanner;

public class Main {
    static int R;

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);

        R=sc.nextInt();
        int cnt=0;
        if(R%5==0){
            System.out.println(R/5);
        }
        else {
            while (true) {
                if(R==0){
                    System.out.println(cnt);
                    break;
                }
                if(R<0){
                    System.out.println(-1);
                    break;
                }
                R-=2;
                cnt++;
                if(R%5==0){
                    cnt+=R/5;
                    System.out.println(cnt);
                    break;
                }


            }
        }


    }

}
