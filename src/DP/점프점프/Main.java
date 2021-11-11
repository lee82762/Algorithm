package DP.점프점프;

import java.util.*;

public class Main {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N+1];
        for(int i=1; i<=N; i++){
            arr[i]=sc.nextInt();
        }


        int dp[] = new int[N+1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        dp[1] = 0;


        for (int i = 1; i <= N; i++) {
            if (dp[i] != Integer.MAX_VALUE) {
                int jump = arr[i];
                for (int j = 1; j <= jump; j++) {
                    if (i + j > N) continue;
                    dp[i + j] = Math.min(dp[i] + 1, dp[i + j]);
                }
            }
        }
        if(dp[N]==Integer.MAX_VALUE){
            System.out.println(-1);
        }
        else{
            System.out.println(dp[N]);
        }

    }
}
