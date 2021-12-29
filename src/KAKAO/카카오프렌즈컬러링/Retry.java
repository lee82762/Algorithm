package KAKAO.카카오프렌즈컬러링;

import java.util.LinkedList;
import java.util.Queue;
class Retry {
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static boolean visit[][];
    public int[] solution(int m, int n, int[][] picture) {
        visit=new boolean[m][n];
        int answer[]=new int[2];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(visit[i][j]==false && picture[i][j]!=0) {
                    answer[1] = Math.max(answer[1], bfs(picture, picture[i][j], i, j)+1);
                    answer[0]++;
                }
            }
        }
        return answer;
    }
    static public int bfs(int [][]picture, int temp,int x, int y){
        int cnt=0;
        Queue<Integer>qx=new LinkedList<>();
        Queue<Integer>qy=new LinkedList<>();
        qx.add(x);
        qy.add(y);
        visit[x][y]=true;

        while (!qx.isEmpty() && !qy.isEmpty()){
            int x1=qx.poll();
            int y1=qy.poll();

            for(int i=0; i<4; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];

                if(x2>=0 && x2<picture.length && y2>=0 && y2<picture[0].length){
                    if(visit[x2][y2]==false && picture[x2][y2]==temp){
                        qx.add(x2);
                        qy.add(y2);
                        visit[x2][y2]=true;
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}
