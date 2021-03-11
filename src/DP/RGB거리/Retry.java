package DP.RGB거리;
import java.util.Scanner;

public class Retry{
    static int N;
    static int [][]dp;
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        dp=new int[N][3];

        for(int i=0; i<N; i++){
            for(int j=0; j<3; j++){
                dp[i][j]=sc.nextInt();
            }
        }

        for(int i=1; i<N; i++){
            dp[i][0]=Math.min(dp[i-1][1]+dp[i][0],dp[i-1][2]+dp[i][0]);
            dp[i][1]=Math.min(dp[i-1][0]+dp[i][1],dp[i-1][2]+dp[i][1]);
            dp[i][2]=Math.min(dp[i-1][0]+dp[i][2],dp[i-1][1]+dp[i][2]);
        }


        int answer=10000000;
        for(int i=0; i<3; i++){
            answer=Math.min(answer,dp[N-1][i]);
        }
        System.out.println(answer);


    }
}
