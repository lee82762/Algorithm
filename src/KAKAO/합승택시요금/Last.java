package KAKAO.합승택시요금;

import java.util.*;
class Last {

    public int solution(int n, int s, int a, int b, int[][] fares) {

        int map[][]=new int[n][n];
        for(int a1[]:map){
            Arrays.fill(a1,100000000);
        }

        for(int i=0; i<fares.length; i++){
            int x=fares[i][0];
            int y=fares[i][1];
            int c=fares[i][2];
            map[x-1][y-1]=c;
            map[y-1][x-1]=c;
        }

        for(int k=0; k<n; k++){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    if(i==j) {
                        map[i][j]=0;
                    }
                    map[i][j]=Math.min(map[i][j],map[i][k]+map[k][j]);
                }
            }
        }

        int answer=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            answer=Math.min(answer,map[s-1][i]+map[i][a-1]+map[i][b-1]);
        }

        return answer;
    }

}
