package DP.안녕;

import java.util.Scanner;

public class Main {
    static int N;
    static int L[];
    static int J[];
    static int dp[][];
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        L=new int[21];
        J=new int[21];
        dp=new int[21][101];
        for(int i=1; i<=N; i++){
            L[i]=sc.nextInt();
        }
        for(int i=1; i<=N; i++){
            J[i]=sc.nextInt();
        }

        for(int i=1; i<=N; i++){
            for(int j=1; j<100; j++){
                dp[i][j]=dp[i-1][j];
                if(L[i]<=j&&dp[i-1][j-L[i]]+J[i]>dp[i][j]){
                    dp[i][j]=dp[i-1][j-L[i]]+J[i];
                }

            }
        }
        System.out.println(dp[N][99]);



    }
}
