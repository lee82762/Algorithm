package DP.땅따먹기;

import java.util.Arrays;
class Solution {
    int solution(int[][] land) {
        int sum=0;
        int answer=0;
        for(int i=1; i<land.length; i++){
            for(int j=0; j<land[0].length; j++){
                sum=0;
                for(int k=0; k<land[0].length; k++){
                    if(j==k){
                        continue;
                    }
                    else{
                        sum=Math.max(sum,land[i-1][k]);
                    }
                }
                land[i][j]+=sum;
            }
        }
        Arrays.sort(land[land.length-1]);
        answer=land[land.length-1][land[0].length-1];
        return answer;
    }
}