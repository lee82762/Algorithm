package KAKAO.경주로건설;

import java.util.LinkedList;
import java.util.Queue;
class Solution {
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static boolean visit[][];

    static  int answer=100000000;
    static class Road{
        int x;
        int y;
        int dir;
        int cost;


        public Road(int x, int y, int dir,int cnt){
            this.x=x;
            this.y=y;
            this.dir=dir;
            this.cost=cnt;

        }
    }
    public int solution(int[][] board) {

        visit=new boolean[board.length][board.length];
        bfs(0,0,board.length,board);
        return answer;
    }
    static void  bfs(int x,int y,int n,int map[][]) {
        Queue<Road> q = new LinkedList();
        q.add(new Road(x, y, -1, 0));
        visit[x][y] = true;
        while (!q.isEmpty()) {
            Road r = q.poll();
            int x1 = r.x;
            int y1 = r.y;
            int dir1 = r.dir;
            int cnt1 = r.cost;

            if(x1==n-1&&y1==n-1){
                answer=Math.min(answer,cnt1);
            }
            for (int i = 0; i < 4; i++) {
                int x2 = x1 + dx[i];
                int y2 = y1 + dy[i];
                int dir2 = i;
                int cnt2 = cnt1;
                if (x2 >= 0 && x2 < n && y2 >= 0 && y2 < n) {
                    if (dir1 == -1) {
                        cnt2 += 100;
                    } else if (dir1 == dir2) {
                        cnt2 += 100;
                    } else {
                        cnt2 += 600;
                    }

                    if (visit[x2][y2] == false &&map[x2][y2]!=1 || map[x2][y2] >= cnt2) {
                        visit[x2][y2] = true;
                        map[x2][y2] = cnt2;
                        q.add(new Road(x2, y2, dir2, cnt2));
                    }
                }
            }
        }
    }

}