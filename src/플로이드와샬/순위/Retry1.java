package 플로이드와샬.순위;

import java.util.Arrays;
class Retry1 {
    public int solution(int n, int[][] results) {
        int map[][]=new int[n+1][n+1];

        for(int a[]:map){
            Arrays.fill(a,100000000);
        }
        for(int i=0; i<results.length; i++){
            int a=results[i][0];
            int b=results[i][1];
            map[a][b]=1;

        }



        for(int k=1; k<map.length; k++){
            for(int i=1; i<map.length; i++){
                for(int j=1; j<map.length; j++){
                    if(i==j) continue;
                    map[i][j]=Math.min(map[i][j],map[i][k]+map[k][j]);
                }
            }
        }

        int answer=0;
        for(int i=1; i<map.length; i++){
            boolean result=false;
            for(int j=1; j<map.length; j++){
                if(i==j) continue;
                if(map[i][j]==100000000 && map[j][i]==100000000){
                    result=true;
                }

            }
            if(result==false){
                answer++;
            }
        }
        return answer;
    }
}
