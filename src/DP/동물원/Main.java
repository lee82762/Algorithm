package DP.동물원;

import java.util.Scanner;

public class Main {
    static int N;
    static int []dp;
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        N=sc.nextInt();
        dp=new int[N+1];

        dp[0]=1%9901;
        dp[1]=3%9901;

        for(int i=2; i<=N; i++){
            dp[i]=(dp[i-1]*2+dp[i-2])%9901;
        }
        System.out.println(dp[N]);



    }

}