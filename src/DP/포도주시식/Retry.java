package DP.포도주시식;

import java.util.Scanner;

public class Retry {
    static  int N;
    static  int []dp;
    static  int []arr;
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();

        arr=new int[10001];
        dp=new int[10001];

        for(int i=1; i<=N; i++){
            arr[i]=sc.nextInt();
        }
        dp[1]=arr[1];
        dp[2]=arr[1]+arr[2];

        //3잔연속 마실수 없는 것을 조건으로 생각해야한다.

        for(int i=3; i<=N; i++){
            dp[i]=Math.max(dp[i-1],Math.max(dp[i-2]+arr[i],dp[i-3]+arr[i-1]+arr[i]));
        }

        System.out.println(dp[N]);

    }

}