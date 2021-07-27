package 완전탐색.카펫;

class Solution {
    public int[] solution(int brown, int yellow) {
        int answer[]=new int[2];
        int area=brown+yellow;

        for(int i=1; i<=area; i++){
            int row=i;//세로
            int col=area/i;//가로

            if(row>col){
                continue;
            }

            if((row-2)*(col-2)==yellow){
                answer[0]=col;
                answer[1]=row;
                return answer;
            }
        }
        return answer;




    }
}