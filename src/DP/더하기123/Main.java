package DP.더하기123;

import java.util.Scanner;
public class Main {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        for(int i=0; i<n; i++){

            int a=sc.nextInt();

            int dp[]=new int[1000001];

            dp[0]=1;

            dp[1]=1;

            dp[2]=2;

            dp[3]=4;

            for(int j=4; j<=a; j++){
                dp[j]=dp[j-3]+dp[j-2]+dp[j-1];
            }

            System.out.println(dp[a]);

        }

    }

}
