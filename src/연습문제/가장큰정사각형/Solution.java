package 연습문제.가장큰정사각형;

class Solution
{
    public int solution(int [][]map)
    {
        int answer=0;
        for(int i=1; i<map.length; i++){
            for(int j=1; j<map[0].length; j++){
                if(map[i][j]==0) continue;
                map[i][j]=Math.min(map[i-1][j],Math.min(map[i][j-1],map[i-1][j-1]))+1;

            }
        }



        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[0].length; j++){
                if(answer<map[i][j]){
                    answer=map[i][j];
                }

            }

        }
        answer=answer*answer;
        return answer;
    }
}
