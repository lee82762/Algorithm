package DP.연속합;

import java.util.Scanner;

public class Retry {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int max=0;
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int dp[]=new int[n+1];
        dp[0]=a[0];
        max=a[0];
        for(int i=1; i<n; i++){
            dp[i]=Math.max(dp[i-1]+a[i],a[i]);
            max=Math.max(dp[i],max);
        }
        System.out.println(max);


    }
}
