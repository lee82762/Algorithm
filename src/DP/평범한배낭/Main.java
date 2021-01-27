package DP.평범한배낭;

import java.util.Scanner;

public class Main {
    static int N;
    static int K;
    static int []w;
    static  int []v;
    static  int [][]dp;
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        K=sc.nextInt();
        w=new int[N];
        v=new int [N];
        dp=new int[N+1][K+1];

        for(int i=0; i<N; i++){
            int w1=sc.nextInt();
            int v1=sc.nextInt();
            w[i]=w1;
            v[i]=v1;
        }
        int max=0;

        for(int i=1; i<=N; i++){
            for(int j=1; j<=K; j++){
                if(w[i-1]<=j){
                    dp[i][j]=Math.max(dp[i-1][j],v[i-1]+dp[i-1][j-w[i-1]]);
                }

                else{
                    dp[i][j]=dp[i-1][j];
                }
                max=Math.max(max,dp[i][j]);
            }
        }
        System.out.println(max);

    }

}

