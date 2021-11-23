package DP.정수삼각형;

class Retry {
    public int solution(int[][] triangle) {
        for(int i=1; i<triangle.length; i++){
            for(int j=0; j<triangle[i].length; j++){
                if(j==0){
                    triangle[i][j]+=triangle[i-1][j];
                }
                else if(i==j){
                    triangle[i][j]+=triangle[i-1][j-1];
                }
                else{
                    triangle[i][j]=Math.max(triangle[i][j]+triangle[i-1][j],triangle[i][j]+triangle[i-1][j-1]);
                }

            }
        }
        int answer=0;
        for(int i=0; i<triangle[triangle.length-1].length; i++){

            answer=Math.max(answer,triangle[triangle.length-1][i]);
        }
        return answer;
    }
}
