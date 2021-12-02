package DFSandBFS.게임맵최단거리;

import java.util.LinkedList;
import java.util.Queue;
class Last {
    static int n;
    static int m;
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static boolean visit[][];
    static int answer=0;
    public int solution(int[][] map) {
        n=map.length;
        m=map[0].length;
        visit=new boolean[n][m];
        bfs(0,0,map);
        if(answer==0){
            answer=-1;
        }

        return answer;
    }
    static public void bfs(int x, int y, int [][]map){
        Queue<Integer>qx=new LinkedList<>();
        Queue<Integer>qy=new LinkedList<>();
        qx.add(x);
        qy.add(y);
        visit[x][y]=true;

        while (!qx.isEmpty() && !qy.isEmpty()){
            int x1=qx.poll();
            int y1=qy.poll();
            if(x1==n-1 && y1==m-1){
                answer=map[x1][y1];
                break;
            }

            for(int i=0; i<4; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];

                if(x2>=0 && x2<n && y2>=0 && y2<m){
                    if(visit[x2][y2]==false && map[x2][y2]==1){
                        qx.add(x2);
                        qy.add(y2);
                        visit[x2][y2]=true;
                        map[x2][y2]=map[x1][y1]+1;
                    }
                }
            }
        }

    }
}
