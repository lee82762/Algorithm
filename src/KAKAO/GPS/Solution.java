package KAKAO.GPS;

import java.util.*;
class Solution {
    public int solution(int n, int m, int[][] edge_list, int k, int[] gps_log) {
        int map[][]=new int[n+1][n+1];
        for(int i=0; i<m; i++){
            int a=edge_list[i][0];
            int b=edge_list[i][1];
            map[a][b]=1;
            map[b][a]=1;
        }
        int dp[][]=new int[k][n+1];
        for(int a[]:dp){
            Arrays.fill(a,100000001);
        }
        dp[0][gps_log[0]]=0;

        for(int i=1; i<k; i++){
            for(int j=1; j<n+1; j++){
                for(int node=1; node<n+1; node++){

                    if(map[j][node]==1){
                        dp[i][j]=Math.min(dp[i][j],dp[i-1][node]);
                    }
                }
                if(j!=gps_log[i]){
                    dp[i][j]++;
                }
            }
        }
        int answer=0;
        if(dp[k-1][gps_log[k-1]]<100000001){
            answer=dp[k-1][gps_log[k-1]];
        }
        else{
            return -1;
        }
        return answer;
    }
}
