package DFSandBFS.게임맵최단거리;

import java.util.LinkedList;
import java.util.Queue;
class Retry {
    static int answer;
    static int N;
    static int M;
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static boolean visit[][];
    static class Pair{
        int x;
        int y;
        int dis;
        public Pair(int x,int y,int dis){
            this.x=x;
            this.y=y;
            this.dis=dis;
        }
    }
    public int solution(int[][] map) {

        N=map.length;
        M=map[0].length;
        visit=new boolean[N][M];
        bfs(map,0,0);
        if(answer==0){
            answer=-1;
        }


        return answer;
    }
    static public void bfs(int [][]maps,int x, int y){
        Queue<Pair>queue=new LinkedList<>();
        queue.add(new Pair(x,y,0));
        visit[x][y]=true;

        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x1=p1.x;
            int y1=p1.y;
            int dis1=p1.dis;
            if(x1==N-1&&y1==M-1){
                answer=dis1+1;
            }
            for(int i=0; i<4; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];
                if(x2>=0&&x2<N&&y2>=0&&y2<M){
                    if(maps[x2][y2]==1&&visit[x2][y2]==false){
                        queue.add(new Pair(x2,y2,dis1+1));
                        visit[x2][y2]=true;
                    }
                }
            }
        }

    }
}
