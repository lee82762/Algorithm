package 플로이드와샬.순위;

import java.util.Arrays;
class Last {
    public int solution(int n, int[][] vertex) {
        int  [][]dp=new int[n+1][n+1];
        for(int []a : dp) {
            Arrays.fill(a, 100000000);
        }

        for(int i=0; i<vertex.length; i++){
            int a=vertex[i][0];
            int b=vertex[i][1];
            dp[a][b]=1;
        }

        for(int k=1; k<=n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if(i==j) continue;
                    dp[i][j]=Math.min(dp[i][j],dp[i][k]+dp[k][j]);
                }
            }
        }

        int answer=0;
        for(int i=1; i<=n; i++){
            boolean result=false;
            for(int j=1; j<=n; j++){
                if(i==j) continue;
                if(dp[i][j]==100000000 && dp[j][i]==100000000){
                    result=true;
                }
            }
            if(result==false){
                answer++;
            }
        }
        return answer;
    }
}
