package KAKAO.크레인인형뽑기게임;

import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {

        Stack<Integer>st=new Stack<>();
        int answer=0;



        for(int a=0; a<moves.length; a++) {
            int c=moves[a]-1;
            //System.out.println(c);
            for (int i = 0; i < board.length; i++) {
                if(board[i][c]==0){
                    continue;
                }
                else{
                    if(!st.isEmpty()&&st.peek()==board[i][c]){
                        st.pop();
                        answer++;
                    }
                    else{
                        st.push(board[i][c]);
                    }
                }
                board[i][c]=0;
                break;

            }

        }
        return answer*2;
    }
}
