package DP.Nx2타일링;

class Retry {
    public int solution(int n) {
        int answer = 0;
        int dp[]=new int[60001];
        dp[0]=0;
        dp[1]=1%1000000007;
        dp[2]=2%1000000007;
        for(int i=3; i<=n; i++){
            dp[i]=(dp[i-1]+dp[i-2])%1000000007;
        }
        return dp[n];
    }
}
