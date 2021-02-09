package DP.호텔;

import java.util.*;

public class Retry {
    static  int N;
    static  int K;
    static  int dp[];
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        N=sc.nextInt();
        K=sc.nextInt();
        dp=new int[N+101];

        Arrays.fill(dp, 99999999);
        dp[0] = 0;

        for(int i=0; i<K; i++){
            int m=sc.nextInt();
            int v=sc.nextInt();
            for(int j=v; j<N+101; j++){
                dp[j]=Math.min(dp[j],m+dp[j-v]);
            }

        }

        int ans = 99999999;
        for(int i=N; i<N+101; i++) ans = Math.min(ans, dp[i]);
        System.out.println(ans);




    }

}
