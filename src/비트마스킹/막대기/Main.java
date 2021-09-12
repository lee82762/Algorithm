package 비트마스킹.막대기;

import java.util.Scanner;

public class Main {
    public static void main(String argp[]){
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int cnt=0;
        int stick=64;

        while (X>0){
            if(stick>X){
                stick/=2;
            }
            else{
                X-=stick;
                cnt++;
            }

        }
        System.out.println(cnt);


    }

}
