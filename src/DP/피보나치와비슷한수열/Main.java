package DP.피보나치와비슷한수열;

import java.util.Scanner;

public class Main{
    static int N;
    static long []dp;
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        dp=new long[117];


        dp[1]=1;
        dp[2]=1;
        dp[3]=1;

        for(int i=4; i<=N; i++){
            dp[i]=dp[i-1]+dp[i-3];
        }
        System.out.println(dp[N]);



    }
}
