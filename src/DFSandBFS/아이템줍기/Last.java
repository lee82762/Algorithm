package DFSandBFS.아이템줍기;

import java.util.*;
class Last {
    static int answer=0;
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static int map[][];
    static boolean visit[][];
    static class Pair{
        int x;
        int y;
        int cnt;
        public Pair(int x, int y , int cnt){
            this.x=x;
            this.y=y;
            this.cnt=cnt;
        }
    }
    public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {

        map=new int[105][105];
        visit=new boolean[105][105];

        for(int i=0; i<rectangle.length; i++){
            int x=rectangle[i][0];
            int y=rectangle[i][1];
            int x1=rectangle[i][2];
            int y1=rectangle[i][3];

            for(int j=x*2; j<=x1*2; j++){
                for(int k=y*2; k<=y1*2; k++){
                    map[j][k]=1;
                }
            }
        }

        for(int i=0; i<rectangle.length; i++){
            int x=rectangle[i][0];
            int y=rectangle[i][1];
            int x1=rectangle[i][2];
            int y1=rectangle[i][3];

            for(int j=(x*2)+1; j<=(x1*2)-1; j++){
                for(int k=(y*2)+1; k<=(y1*2)-1; k++){
                    map[j][k]=0;
                }
            }
        }


        bfs(characterX,characterY,itemX,itemY);

        return answer;
    }

    static public void bfs(int x, int y,int itemX, int itemY){
        Queue<Pair>queue=new LinkedList<>();
        queue.add(new Pair(x*2,y*2,0));
        visit[x*2][y*2]=true;

        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x1=p1.x;
            int y1=p1.y;
            int cnt1=p1.cnt;
            if(x1==itemX*2 && y1==itemY*2){
                answer=cnt1/2;
                return;
            }

            for(int i=0; i<4; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];

                if(x2>=0 && x2<105 && y2>=0 && y2<105){
                    if(visit[x2][y2]==false && map[x2][y2]==1){
                        queue.add(new Pair(x2,y2,cnt1+1));
                        visit[x2][y2]=true;
                    }
                }
            }
        }
    }
}
