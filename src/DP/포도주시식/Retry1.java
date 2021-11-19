package DP.포도주시식;

import java.util.Scanner;

public class Retry1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner( System.in);
        int N=sc.nextInt();
        int arr[]=new int[10001];
        for(int i=1; i<=N; i++){
            arr[i]=sc.nextInt();
        }
        int dp[]=new int[10001];
        dp[1]=arr[1];
        dp[2]=arr[1]+arr[2];
        for(int i=3; i<=N; i++){
            dp[i]=Math.max(dp[i-1],Math.max(dp[i-3]+arr[i-1]+arr[i],dp[i-2]+arr[i]));
        }
        System.out.println(dp[N]);

    }
}
