package DP.스티커모으기;

class Solution {
    public int solution(int sticker[]) {
        int dp[]=new int[sticker.length];
        int dp1[]=new int[sticker.length];

        if(sticker.length==1){
            return sticker[sticker.length-1];
        }

        //첫번째 선택한 경우
        dp[0]=sticker[0];
        dp[1]=sticker[0];

        for(int i=2; i<sticker.length-1; i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+sticker[i]);
        }

        //첫번째 선택하지 않을 경우
        dp1[0]=0;
        dp1[1]=sticker[1];

        for(int i=2; i<sticker.length; i++){
            dp1[i]=Math.max(dp1[i-1],dp1[i-2]+sticker[i]);
        }
        int answer=0;
        answer=Math.max(dp[sticker.length-2],dp1[sticker.length-1]);

        return answer;
    }
}
