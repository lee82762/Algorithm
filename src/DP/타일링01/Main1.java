package DP.타일링01;

import java.util.Scanner;
public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        long dp[]=new long[10000001];
        dp[0]=0%15746;
        dp[1]=1%15746;
        dp[2]=2%15746;

        for(int i=3; i<=N; i++){
            dp[i]=(dp[i-1]+dp[i-2])%15746;
        }
        System.out.println(dp[N]);


    }
}