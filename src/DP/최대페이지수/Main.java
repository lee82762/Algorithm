package DP.최대페이지수;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int d[]=new int[m+1];
        int c[]=new int[m+1];

        for(int i=1; i<=m; i++){
            d[i]=sc.nextInt();
            c[i]=sc.nextInt();
        }
        int dp[][]=new int[m+1][n+1];

        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(j>=d[i]){
                    dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-d[i]]+c[i]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[m][n]);

    }
}
