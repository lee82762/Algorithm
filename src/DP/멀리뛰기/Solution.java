package DP.멀리뛰기;
class Solution {
    public long solution(int n) {
        //점화식을 이용한 풀이
        long answer = 0;
        long dp[]=new long[n+1];
        dp[0]=1%1234567;
        dp[1]=1%1234567;
        for(int i=2; i<=n; i++){
            dp[i]= (dp[i-1]%1234567) + (dp[i-2]%1234567);

        }
        answer=dp[n];
        return answer;
    }
}