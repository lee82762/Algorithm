package DP.연속합;

import java.util.*;

public class Main {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        int dp[]=new int[N];
        dp[0]=arr[0];
        int max=arr[0];
        for(int i=1; i<N; i++){
            dp[i]=Math.max(dp[i-1]+arr[i], arr[i]);
            max=Math.max(dp[i],max);
        }
        System.out.println(max);


    }
}
