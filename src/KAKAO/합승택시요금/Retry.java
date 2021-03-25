package KAKAO.합승택시요금;

import java.util.*;
class Retry {

    public int solution(int n, int s, int a, int b, int[][] fares) {
        int dp[][]=new int[n+1][n+1];

        for(int []t:dp){
            Arrays.fill(t,100000000);
        }

        for(int i=0; i<fares.length; i++){
            int x=fares[i][0];
            int y=fares[i][1];
            dp[x][y]=fares[i][2];
            dp[y][x]=fares[i][2];
        }


        for(int k=1; k<=n; k++){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(i==j){
                        dp[i][j]=0;
                    }
                    else{
                        dp[i][j]=Math.min(dp[i][j],dp[i][k]+dp[k][j]);
                    }
                }
            }
        }


        int answer=100000000;

        for(int i=1; i<=n; i++){
            answer=Math.min(answer,dp[s][i]+dp[i][a]+dp[i][b]);
        }

        return answer;
    }

}
