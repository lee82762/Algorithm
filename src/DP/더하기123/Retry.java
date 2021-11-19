package DP.더하기123;

import java.util.Scanner;

public class Retry {
    public static void main(String args[]) {
        Scanner sc = new Scanner( System.in);
        int N=sc.nextInt();
        for(int i=0; i<N; i++){
            int a=sc.nextInt();
            long dp[]=new long[1000001];
            dp[0]=0;
            dp[1]=1%1000000009;
            dp[2]=2%1000000009;
            dp[3]=4%1000000009;
            for(int j=4; j<=a; j++){
                dp[j]=(dp[j-3]+dp[j-2]+dp[j-1])%1000000009;
            }
            System.out.println(dp[a]);

        }



    }
}
