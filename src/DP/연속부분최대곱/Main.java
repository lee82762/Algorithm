package DP.연속부분최대곱;


import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        double arr[]=new double[n];
        for(int i=0; i<n; i++){
            arr[i]=sc.nextDouble();
        }
        double dp[]=new double[n+1];
        dp[0]=arr[0];
        double max=0.0;

        for(int i=1; i<n; i++){
            dp[i]=Math.max(arr[i],dp[i-1]*arr[i]);
            max=Math.max(max,dp[i]);
        }

        System.out.printf("%.3f",max);


    }
}
