package DP.계단오르기;

import java.util.Scanner;
//규칙을 잘찾아보자!
public class Main {
    static int N;
    static int []arr;
    static int []dp;
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        arr=new int[N+1];
        dp=new int[N+1];

        for(int i=1; i<=N; i++){
            arr[i]=sc.nextInt();
        }

        dp[1]=arr[1];

        if(N>=2){
            dp[2]=arr[1]+arr[2];
        }


        for(int i=3; i<=N; i++){
            dp[i]=Math.max(dp[i-2]+arr[i],dp[i-3]+arr[i-1]+arr[i]);
        }
        System.out.println(dp[N]);

    }

}
