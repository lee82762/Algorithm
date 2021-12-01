package DP.RGB거리;

import java.util.Scanner;

public class Last {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int dp[][]=new int[N][3];
        for(int i=0; i<N; i++){
            for(int j=0; j<3; j++){
                dp[i][j]=sc.nextInt();
            }
        }

        for(int i=1; i<N; i++){
            for(int j=0; j<3; j++){
                if(j==0){
                    dp[i][j]=Math.min(dp[i-1][j+1]+dp[i][j],dp[i-1][j+2]+dp[i][j]);
                }
                else if(j==1){
                    dp[i][j]=Math.min(dp[i-1][j-1]+dp[i][j],dp[i-1][j+1]+dp[i][j]);
                }
                else{
                    dp[i][j]=Math.min(dp[i-1][j-1]+dp[i][j],dp[i-1][j-2]+dp[i][j]);
                }
            }
        }
        int answer=Integer.MAX_VALUE;
        for(int i=0; i<3; i++){
            answer=Math.min(answer,dp[N-1][i]);
        }
        System.out.println(answer);
    }
}
