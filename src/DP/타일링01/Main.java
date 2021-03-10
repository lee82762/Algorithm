package DP.타일링01;

import java.util.Scanner;

public class Main {
 //점화식 생각 유동적으로 하기!!!

    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        long dp[]=new long[10000001];
        dp[0]=0;
        dp[1]=1%15746;
        dp[2]=2%15746;
        
        for(int i=3; i<=n; i++){
            dp[i]=(dp[i-2]+dp[i-1])%15746;

        }
        System.out.println(dp[n]);


    }

}
