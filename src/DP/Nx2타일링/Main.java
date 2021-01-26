package DP.Nx2타일링;

import java.util.Scanner;

public class Main{
    static int N;
    static int dp[];
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        N=sc.nextInt();
        dp=new int[N+1];
        dp[0]=1%10007;
        dp[1]=1%10007;

        for(int i=2; i<=N; i++){
            dp[i]=(dp[i-1]+dp[i-2])%10007;
        }
        System.out.println(dp[N]);


    }

}
