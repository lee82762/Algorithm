package 월간코드챌린지.배열자르기;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
//메모리 초과
class Solution {
    static int dx[]={1,-1,0,0,1,1,-1,-1};
    static int dy[]={0,0,1,-1,1,-1,1,-1};
    static boolean visit[][];
    public int[] solution(int n, long left, long right) {
        int map[][]=new int[n+1][n+1];
        visit=new boolean[n+1][n+1];
        map[1][1]=1;
        bfs(1,1,n,map);
        ArrayList<Integer>a1=new ArrayList<>();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                a1.add(map[i][j]);
            }

        }

        int answer[]=new int[(int) ((right-left)+1)];
        int cnt=0;
        for(long i=left; i<=right; i++){
            answer[cnt++]=a1.get((int) i);
        }
        return answer;
    }
    static public void bfs(int x,int y,int n,int [][]map){
        Queue<Integer>qx=new LinkedList<>();
        Queue<Integer>qy=new LinkedList<>();
        qx.add(x);
        qy.add(y);
        visit[x][y]=true;
        while (!qx.isEmpty()&&!qy.isEmpty()){
            int x1=qx.poll();
            int y1=qy.poll();

            for(int i=0; i<8; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];
                if(x2>=0&&x2<=n&&y2>=0&&y2<=n) {
                    if (visit[x2][y2] == false) {
                        map[x2][y2]=map[x1][y1]+1;
                        qx.add(x2);
                        qy.add(y2);
                        visit[x2][y2]=true;
                    }
                }
            }
        }
    }
}
