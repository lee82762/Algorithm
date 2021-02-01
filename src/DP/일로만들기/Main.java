package DP.일로만들기;

import java.util.Scanner;
//작은것 에서부터 큰것으로 만들기
public class Main {
    static int N;
    static int []dp;
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        dp=new int[N+1];
        dp[1]=0;

        for(int i=2; i<=N; i++){
            dp[i]=dp[i-1]+1;
            if(i%3==0){
                dp[i]=Math.min(dp[i],dp[i/3]+1);
            }
            if(i%2==0){
                dp[i]=Math.min(dp[i],dp[i/2]+1);
            }
        }
        System.out.println(dp[N]);




    }

}