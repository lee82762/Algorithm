package KAKAO.프렌즈블록;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
class Solution {

    static ArrayList<String>s1=new ArrayList<>();
    static int dx[]={1,0,1};
    static int dy[]={0,1,1};
    static int answer=0;
    static class Pair{
        int x;
        int y;
        public Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    static Queue<Pair>queue1=new LinkedList<>();
    public int solution(int m, int n, String[] board) {

        String [][]board1=new String[m][n];
        for(int i=0; i<m; i++){
            String s=board[i];
            for(int j=0; j<n; j++){
                board1[i][j]=String.valueOf(s.charAt(j));
            }
        }

        while (true) {

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if(board1[i][j].equals("0")){
                        continue;
                    }
                    check(board1, i, j, m, n, board1[i][j]);

                }

            }
            if(s1.size()==0){
                break;
            }


            dowmboard(board1, m, n);
            answer += s1.size();
            s1.clear();
        }

        return answer;
    }
    static void check(String [][]board1, int x,int y, int m, int n,String s){
        Queue<Pair>queue=new LinkedList<>();
        queue.add(new Pair(x,y));


        Pair p1=queue.poll();
        int x1=p1.x;
        int y1=p1.y;

        for(int i=0; i<3; i++){
            int x2=x1+dx[i];
            int y2=y1+dy[i];

            if(x2>=0&&x2<m&&y2>=0&&y2<n&&board1[x2][y2].equals(s)){
                queue.add(new Pair(x2,y2));
            }
        }


        if(queue.size()==3){
            while (!queue.isEmpty()){
                Pair p2=queue.poll();
                String re=Integer.toString(p2.x);
                String re1=Integer.toString(p2.y);
                if(!s1.contains(re+"-"+re1)) {
                    s1.add(re + "-" + re1);
                }
            }
            if(!s1.contains(Integer.toString(x1)+"-"+Integer.toString(y1))) {
                s1.add(Integer.toString(x1) + "-" + Integer.toString(y1));
            }
            queue1.add(new Pair(x1,y1));
        }

    }


    static void dowmboard(String [][]board1, int m ,int n){
        while (!queue1.isEmpty()){
            Pair p1=queue1.poll();
            int x1=p1.x;
            int y1=p1.y;

            board1[x1][y1]="0";
            for(int i=0; i<3; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];
                board1[x2][y2]="0";
            }
        }


        for(int k=0; k<m; k++) {
            for (int i = 1; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (board1[i][j].equals("0")) {
                        board1[i][j] = board1[i - 1][j];
                        board1[i - 1][j] = "0";
                    }
                }

            }
        }

    }
}
