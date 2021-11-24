package 연습문제.가장큰정사각형;

class Retry
{
    public int solution(int [][]board)
    {

        int cnt=0;
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board[i].length; j++){
                if(board[i][j]==1){
                    cnt++;
                }
            }
        }

        int answer=0;
        for(int i=1; i<board.length; i++){
            for(int j=1; j<board[i].length; j++){
                if(board[i][j]==0) continue;
                board[i][j]=Math.min(Math.min(board[i-1][j],board[i][j-1]),board[i-1][j-1])+1;
                answer=Math.max(answer,board[i][j]);
            }
        }

        if(cnt==1){
            answer=1;
        }
        return answer*answer;
    }
}
