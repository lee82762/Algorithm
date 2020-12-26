package DP.땅따먹기;

class Solution1 {
    int solution(int[][] land) {
        //4열일때만 가능한 코드, DP사용
        for(int i=1; i<land.length; i++){
            //같은열이 아닌 이전의 행의 최댓값을 더해준다.
            land[i][0]+=Math.max(land[i-1][1],Math.max(land[i-1][2],land[i-1][3]));
            land[i][1]+=Math.max(land[i-1][0],Math.max(land[i-1][2],land[i-1][3]));
            land[i][2]+=Math.max(land[i-1][0],Math.max(land[i-1][1],land[i-1][3]));
            land[i][3]+=Math.max(land[i-1][0],Math.max(land[i-1][1],land[i-1][2]));
        }
        int answer=0;
        for(int i=land.length-1; i<land.length; i++){
            for(int j=0; j<land[i].length; j++){
                answer=Math.max(answer,land[i][j]);

            }

        }
        return answer;
    }
}
