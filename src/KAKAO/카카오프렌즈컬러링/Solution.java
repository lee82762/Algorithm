package KAKAO.카카오프렌즈컬러링;

import java.util.LinkedList;
import java.util.Queue;
class Solution {
    static boolean visit[][];
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static int ans=0;
    public int[] solution(int m, int n, int[][] picture) {
        int answer1=0;
        visit=new boolean[m][n];
        int answer[]=new int[2];
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(visit[i][j]==false&&picture[i][j]!=0){
                    bfs(i,j,m,n,picture,0);
                    answer1++;
                    answer[1]=Math.max(ans,answer[1]);
                    ans=0;
                }
            }
        }
        answer[0]=answer1;
        return answer;
    }
    static public void bfs(int x, int y,int m, int n,int [][]picture,int cnt){
        Queue<Integer>qx=new LinkedList<>();
        Queue<Integer>qy=new LinkedList<>();
        qx.add(x);
        qy.add(y);
        visit[x][y]=true;

        while (!qx.isEmpty()&&!qy.isEmpty()){
            int x1=qx.poll();
            int y1=qy.poll();
            cnt++;
            for(int i=0; i<4; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];

                if(x2>=0&&x2<m&&y2>=0&&y2<n){
                    if(visit[x2][y2]==false&&picture[x][y]==picture[x2][y2]){
                        qx.add(x2);
                        qy.add(y2);
                        visit[x2][y2]=true;
                    }
                }
            }
        }
        ans=cnt;
    }
}