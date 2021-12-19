package DFSandBFS.아이템줍기;

import java.util.*;
class Retry {
    static int dx[] = {1, -1, 0, 0};
    static int dy[] = {0, 0, 1, -1};
    static int answer=0;
    static class Pair{
        int x;
        int y;
        int cnt;
        public Pair(int x, int y, int cnt){
            this.x=x;
            this.y=y;
            this.cnt=cnt;
        }
    }
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
        int map[][]=new int[105][105];
        boolean visit[][]=new boolean[105][105];

        for(int i=0; i<rectangle.length; i++){
            int a=rectangle[i][0];
            int b=rectangle[i][1];
            int a1=rectangle[i][2];
            int b1=rectangle[i][3];

            for(int j=(a*2); j<=(a1*2); j++){
                for(int k=(b*2); k<=(b1*2); k++){
                    map[j][k]=1;
                }
            }
        }

        for(int i=0; i<rectangle.length; i++){
            int a=rectangle[i][0];
            int b=rectangle[i][1];
            int a1=rectangle[i][2];
            int b1=rectangle[i][3];

            for(int j=(a*2)+1; j<=(a1*2)-1; j++){
                for(int k=(b*2)+1; k<=(b1*2)-1; k++){
                    map[j][k]=0;
                }
            }
        }
        bfs(characterX,characterY,itemX,itemY,visit,map);

        return answer;
    }

    static public void bfs(int x, int y, int x1, int y1,boolean visit[][],int map[][]){
        Queue<Pair>queue=new LinkedList<>();
        queue.add(new Pair(x*2,y*2,0));
        visit[x*2][y*2]=true;

        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x2=p1.x;
            int y2=p1.y;
            int cnt1=p1.cnt;
            if(x2==x1*2 && y2==y1*2){
                answer=cnt1/2;
                break;
            }

            for(int i=0; i<4; i++){
                int x3=x2+dx[i];
                int y3=y2+dy[i];

                if(x3>=0 && x3<105 && y3>=0 && y3<105){
                    if(visit[x3][y3]==false && map[x3][y3]==1){
                        queue.add(new Pair(x3,y3,cnt1+1));
                        visit[x3][y3]=true;
                    }
                }
            }

        }
    }
}
