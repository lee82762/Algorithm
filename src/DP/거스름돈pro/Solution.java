package DP.거스름돈pro;

class Solution {
    public int solution(int n, int[] money) {
        int answer = 0;

        int dp[][]=new int[money.length+1][n+1];

        dp[0][0]=0;
        for(int i=1; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                if(j==0){
                    dp[i][j]=1;
                }
                else{
                    if(j>=money[i-1]){
                        dp[i][j]=dp[i-1][j]+dp[i][j-money[i-1]];
                    }
                    else{
                        dp[i][j]=dp[i-1][j];
                    }
                }
            }
        }

        answer=dp[money.length][n];
        return answer;
    }
}