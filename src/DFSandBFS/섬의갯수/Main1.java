package DFSandBFS.섬의갯수;

import java.util.*;

public class Main1 {
    static  int w;
    static  int h;
    static  int dx[]={1,-1,0,0,1,1,-1,-1};
    static  int dy[]={0,0,1,-1,1,-1,1,-1};
    static  int dp[][];
    static  boolean visit[][];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            w = sc.nextInt();
            h = sc.nextInt();

            if(w==0&&h==0){
                break;
            }

            dp = new int[h][w];
            visit = new boolean[h][w];
            int answer = 0;

            for (int i = 0; i < h; i++) {

                for (int j = 0; j < w; j++) {
                    dp[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (visit[i][j] == false && dp[i][j] == 1) {
                        bfs(i, j);
                        answer++;
                    }
                }
            }

            System.out.println(answer);
        }




    }
    static void  bfs(int x,int y){
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


                if(x2>=0&&x2<h&&y2>=0&&y2<w){
                    if(visit[x2][y2]==false&&dp[x2][y2]==1){
                        qx.add(x2);
                        qy.add(y2);
                        visit[x2][y2]=true;
                    }
                }

            }
        }

    }



}
