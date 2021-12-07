package DP.평범한배낭;

import java.util.Scanner;

public class Last {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int w[]=new int[n+1];
        int v[]=new int[n+1];
        for(int i=1; i<=n; i++){
            w[i]=sc.nextInt();
            v[i]=sc.nextInt();
        }

        int dp[][]=new int[n+1][k+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=k; j++){
                if(j>=w[i]) {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i-1][j - w[i]] + v[i]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }

        System.out.println(dp[n][k]);


    }
}