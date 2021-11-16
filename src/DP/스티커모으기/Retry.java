package DP.스티커모으기;

class Retry {
    public int solution(int sticker[]) {
        int dp[]=new int[sticker.length];
        int dp1[]=new int[sticker.length];
        if(sticker.length==1){
            return sticker[0];
        }
        dp[0]=sticker[0];
        dp[1]=sticker[0];
        for(int i=2; i<sticker.length; i++){
            dp[i]=Math.max(dp[i-1],dp[i-2]+sticker[i]);
        }

        dp1[0]=0;
        dp1[1]=sticker[1];
        for(int i=2; i<sticker.length; i++){
            dp1[i]=Math.max(dp1[i-1],dp1[i-2]+sticker[i]);
        }
        int answer=Math.max(dp[sticker.length-2],dp1[sticker.length-1]);
        return answer;
    }
}
