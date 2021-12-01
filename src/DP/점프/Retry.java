package DP.점프;

import java.util.Scanner;

public class Retry {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int map[][]=new int[N][N];
        long dp[][]=new long[N][N];
        dp[0][0]=1;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                map[i][j]=sc.nextInt();
            }
        }
        long answer=0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(i==N-1 && j==N-1){
                    answer=dp[i][j];
                }

                if(i+map[i][j]<N){
                    dp[i+map[i][j]][j]=dp[i][j]+dp[i+map[i][j]][j];
                }
                if(j+map[i][j]<N){
                    dp[i][j+map[i][j]]=dp[i][j]+dp[i][j+map[i][j]];
                }
            }
        }
        System.out.println(answer);

    }
}
