package 플로이드와샬.합승택시요금;

class Retry {

    public int solution(int n, int s, int a, int b, int[][] fares) {
        int [][]dp=new int[n+1][n+1];

        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp.length; j++){
                dp[i][j]=100000000;
            }
        }

        for(int i=0; i<fares.length; i++){
            int a1=fares[i][0];
            int b1=fares[i][1];
            int c=fares[i][2];
            dp[a1][b1]=c;
            dp[b1][a1]=c;
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
