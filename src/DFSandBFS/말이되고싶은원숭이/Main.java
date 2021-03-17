package DFSandBFS.말이되고싶은원숭이;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int max=987654321;

    static int W;
    static int H;
    static int K;
    static int dp[][];
    static int answer=max;
    static boolean visit[][][];
    //1칸씩 움직임
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    //말처럼 움직임
    static int hx[] = { -1, -2, -2, -1, 1, 2, 2, 1 };
    static int hy[] = { -2, -1, 1, 2, 2, 1, -1, -2 };

    static class Pair{
        int r,c,cnt,dst;
        public Pair(int r,int c,int cnt,int dst){
            this.r=r;
            this.c=c;
            this.cnt=cnt; //말처럼움직일수 있는 횟수
            this.dst=dst;
        }
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        K=sc.nextInt();
        W=sc.nextInt();
        H=sc.nextInt();

        dp=new int[H][W];
        visit=new boolean[H][W][31];

        for(int i=0; i<H; i++){
            for(int j=0; j<W; j++){
                dp[i][j]=sc.nextInt();

            }
        }
        bfs(0,0);

        if(answer==max){
            System.out.println("-1");
        }
        else {
            System.out.println(answer);
        }


    }
    public static void bfs(int x,int y) {
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(x,y,0,0));

        while (!q.isEmpty()){
            Pair cur=q.poll();

            if(cur.r==H-1&&cur.c==W-1){
                answer =  cur.dst ;
                break;
            }
            //1칸씩움직임
            for(int i=0; i<4; i++){
                int x1=cur.r+dx[i];
                int y1=cur.c+dy[i];
                int cnt1=cur.cnt;
                if(x1>=0&&x1<H&&y1>=0&&y1<W){
                    if(visit[x1][y1][cnt1]==false&&dp[x1][y1]!=1){
                        visit[x1][y1][cnt1]=true;
                        q.add(new Pair(x1,y1,cnt1,cur.dst+1));

                    }
                }
            }
            //말처럼 갈수 있는 움직임
            for(int i=0; i<8; i++){
                int x1=cur.r+hx[i];
                int y1=cur.c+hy[i];
                int cnt1=cur.cnt+1;
                if(cnt1<=K&&x1>=0&&x1<H&&y1>=0&&y1<W){
                    if(visit[x1][y1][cnt1]==false&&dp[x1][y1]!=1){
                        visit[x1][y1][cnt1]=true;
                        q.add(new Pair(x1,y1,cnt1,cur.dst+1));
                    }
                }

            }

        }

    }


}
