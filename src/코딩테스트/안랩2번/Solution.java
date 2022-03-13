package 코딩테스트.안랩2번;

import java.util.LinkedList;
import java.util.Queue;
class Solution {
    static int dx[]={ 1, -1, 0, 0};
    static int dy[] = { 0, 0 , 1, -1};
    static boolean visit[][];
    static int time = 1;
    static int answer = 0;
    static class Pair{
        int x = 0;
        int y = 0;
        int cnt = 0;
        public Pair(int x, int y, int cnt){
            this.x = x;
            this.y = y;
            this.cnt = cnt;
        }
    }
    public int solution(int n, int[][] board) {
        int temp[] = new int[2];
        while (true){
            if(time > n*n){
                break;
            }
            if( temp[0]== 0 && temp[0]==0){
                temp = bfs(board,temp[0],temp[1],n);
            }
            else{
                temp = bfs(board,temp[0],temp[1],n);
            }

        }
        return answer;
    }
    //상하좌우로 움직이며 최소횟수로 옮겨가는 함수
    static public int[] bfs(int board[][], int x, int y ,int n){
        visit=new boolean[n][n];
        Queue<Pair> queue =new LinkedList<>();
        queue.add(new Pair(x,y,0));
        visit[x][y]=true;
        int answer1[] = new int[2];

        while (!queue.isEmpty()){
            Pair p1 = queue.poll();
            int x1 = p1.x;
            int y1 = p1.y;
            int cnt1 = p1.cnt;

            if(board[x1][y1]==time){
                answer1[0]=x1;
                answer1[1]=y1;
                answer += (cnt1+1);
                time++;
                return answer1;
            }

            for(int i=0; i<4; i++){
                int x2 = x1 + dx[i];
                int y2 = y1 + dy[i];
                //범위내 이동
                if(x2 >= 0 && x2 < n && y2 >= 0 && y2 < n){
                    if(visit[x2][y2] == false){
                        queue.add(new Pair(x2,y2,cnt1+1));
                        visit[x2][y2] = true;
                    }
                }
                //범위를 벗어나는 경우
                else{
                    if(x2 == -1){
                        if(visit[n-1][y2] == false){
                            queue.add(new Pair(n-1 ,y2,cnt1+1));
                            visit[n-1][y2] = true;
                        }
                    }
                    else if( x2 == n){
                        if(visit[0][y2] == false){
                            queue.add(new Pair(0,y2,cnt1+1));
                            visit[0][y2] = true;
                        }
                    }
                    else if( y2 == -1 ){
                        if(visit[x2][n-1] == false){
                            queue.add(new Pair(x2,n-1,cnt1+1));
                            visit[x2][n-1] = true;
                        }
                    }
                    else if( y2 == n){
                        if(visit[x2][0] == false){
                            queue.add(new Pair(x2,0,cnt1+1));
                            visit[x2][0] = true;
                        }
                    }
                }
            }
        }
        return answer1;
    }
}
