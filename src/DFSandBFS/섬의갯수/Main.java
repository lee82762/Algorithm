package DFSandBFS.섬의갯수;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int cnt=0;
    static int W;
    static int H;
    static int dp[][];
    //대각선 추가
    static int dx[]={1,-1,0,0,1,1,-1,-1};
    static int dy[]={0,0,1,-1,1,-1,1,-1};

    static boolean visit[][];
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        while (true) {
            W = sc.nextInt();
            H = sc.nextInt();

            if(W==0&&H==0){
                break;
            }
            dp = new int[H][W];
            visit=new boolean[H][W];
            for(int i=0; i<H; i++){
                for(int j=0; j<W; j++){
                    dp[i][j]=sc.nextInt();
                }
            }

            for(int i=0; i<H; i++){
                for(int j=0; j<W; j++){
                    if(visit[i][j]==false&&dp[i][j]==1){
                        bfs(i,j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
            cnt=0;

        }



    }

    static public void bfs(int x, int y){
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

                if(x2>=0&&x2<H&&y2>=0&&y2<W){
                    if(dp[x2][y2]==1&&visit[x2][y2]==false){
                        visit[x2][y2]=true;
                        qx.add(x2);
                        qy.add(y2);

                    }
                }
            }
        }
    }




}
