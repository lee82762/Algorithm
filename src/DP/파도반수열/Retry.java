package DP.파도반수열;

import java.util.Scanner;

public class Retry {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0; i<n; i++){
            int a=sc.nextInt();
            long dp[]=new long[101];

            dp[1]=1;
            dp[2]=1;


            for(int j=3; j<=a; j++){
                dp[j]=dp[j-2]+dp[j-3];
            }
            System.out.println(dp[a]);

        }

    }
}
