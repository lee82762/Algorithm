package 리틀코드.PerfectSquares;


import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int numSquares(int n) {
        ArrayList<Integer> a1=new ArrayList<>();
        int cnt=1;

        while (cnt*cnt<=n){
            a1.add(cnt*cnt);
            cnt++;
        }
        if (a1.contains(n)) {
            return 1 ;
        }
        cnt=cnt-1;
        int dp[]=new int[n+1];

        Arrays.fill(dp,100001);
        dp[0]=0;
        for(int i=0; i<a1.size(); i++){
            for(int j=a1.get(i); j<=n; j++){
                dp[j]=Math.min(dp[j],dp[j-a1.get(i)]+1);
            }
        }
        return dp[n];

    }
}