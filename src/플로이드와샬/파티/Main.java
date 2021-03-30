package 플로이드와샬.파티;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static  int N;
    static int M;
    static  int X;
    static int dp[][];

    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        X=sc.nextInt();

        dp=new int[N+1][N+1];

        for(int t[]:dp){
            Arrays.fill(t,100000000);
        }


        for(int i=0; i<M; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            dp[a][b]=c;


        }

        for(int k=1; k<=N; k++){
            for(int i=1; i<=N; i++){
                for(int j=1; j<=N; j++){
                    if(i==j){
                        dp[i][j]=0;
                    }
                    else{
                        dp[i][j]=Math.min(dp[i][j],dp[i][k]+dp[k][j]);
                    }

                }
            }
        }


        int max=0;
        for(int i=1; i<=N; i++){
            max=Math.max(max,dp[i][X]+dp[X][i]);

        }
        System.out.println(max);







    }

}
