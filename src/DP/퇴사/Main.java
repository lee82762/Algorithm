package DP.퇴사;

import java.util.Scanner;


public class Main {
    static  int N;
    static  int t[];
    static  int p[];
    static  int dp[];
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        t=new int[N+10];
        p=new int[N+10];
        dp=new int[N+10];

        for(int i=1; i<=N; i++){
            t[i]=sc.nextInt();
            p[i]=sc.nextInt();
        }


        for(int i=N; i>=1; i--){
            if(i+t[i]>N+1){
                dp[i]=dp[i+1];
            }
            else{
                dp[i]=Math.max(dp[i+1],dp[i+t[i]]+p[i]);
            }
        }
        System.out.println(dp[1]);

    }
}
