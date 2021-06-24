package 플로이드와샬.순위;

import java.util.Arrays;
class Solution {
    public int solution(int n, int[][] results) {
        int[][] dp = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            Arrays.fill(dp[i], 100000000);
        }



        for (int i = 0; i < results.length; i++) {
            int a = results[i][0];
            int b = results[i][1];
            dp[a][b] = 1;

        }


        for(int k=1; k<=n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {

                    dp[i][j]=Math.min(dp[i][j],dp[i][k]+dp[k][j]);

                }

            }
        }


        int answer=0;
        for(int i=1; i<=n; i++){
            boolean check=true;
            for(int j=1; j<=n; j++){
                if(i==j) {
                    continue;
                }
                if(dp[i][j]==100000000&&dp[j][i]==100000000){
                    check=false;
                }

            }
            if(check==true){
                answer++;
            }

        }
        return answer;
    }
}
