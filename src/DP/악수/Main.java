package DP.악수;

import java.util.Scanner;

public class Main {
    static  int N;
    static  int dp[];

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        dp=new int[N];

        dp[0]=1%10;
        dp[1]=2%10;

        for(int i=2; i<N; i++){
            dp[i]=(dp[i-1]+dp[i-2])%10;
        }
        System.out.println(dp[N-1]);





    }
}