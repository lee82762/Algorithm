package DP.등굣길;

class Solution {
    public int solution(int m, int n, int[][] puddles) {
        int [][]map=new int[n+1][m+1];
        map[1][1]=1;
        for(int i=0; i<puddles.length; i++){
            map[puddles[i][1]][puddles[i][0]]=-1;
        }

        for(int i=1; i<map.length; i++){
            for(int j=1; j<map[i].length; j++){
                if(map[i][j]==-1){
                    map[i][j]=0;
                }
                else{
                    if(i==1){
                        map[i][j]=(map[i][j]+map[i][j-1])%1000000007;
                    }
                    else{
                        map[i][j]=(map[i-1][j]+map[i][j-1])%1000000007;
                    }
                }

            }
        }
        int answer=map[n][m];
        return answer;
    }
}
