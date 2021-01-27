package DP.설탕배달;

import java.util.Scanner;

public class Main {
    static int N;

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        int cnt=0;
        while (true){
            if(N%3==0&&N%5==0){
                N-=5;
            }
            else if(N%5==0){
                N-=5;
            }
            else if(N%3==0){
                N-=3;
            }
            else{
                N-=5;
            }
            cnt++;
            if(N==0) {
                break;
            }
            if(N<0) {
                cnt=-1;
                break;
            }

        }
        System.out.println(cnt);
    }






}
