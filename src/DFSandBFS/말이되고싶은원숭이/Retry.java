package DFSandBFS.말이되고싶은원숭이;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//3차원 배열 생각하기
public class Retry {
    static int max=987654321;

    static int W;
    static int H;
    static int K;
    static int dp[][];
    static int answer=max;
    static boolean visit[][][];
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static int hx[] = { -1, -2, -2, -1, 1, 2, 2, 1 };
    static int hy[] = { -2, -1, 1, 2, 2, 1, -1, -2 };

    static class Pair{
        int x;
        int y;
        int cnt;
        int dst;

        public Pair(int x, int y, int cnt, int dst) {
            this.x=x;
            this.y=y;
            this.cnt=cnt;
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
        else{
            System.out.println(answer);
        }

    }
    public static void bfs(int x,int y) {
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(x,y,0,0));

        while (!q.isEmpty()){
            Pair p1=q.poll();
            int x1=p1.x;
            int y1=p1.y;
            if(x1==H-1&&y1==W-1){
                answer=p1.dst;
                break;
            }

            for(int i=0; i<4; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];
                int cnt1=p1.cnt;
                if(x2>=0&&x2<H&&y2>=0&&y2<W){
                    if(dp[x2][y2]!=1&&visit[x2][y2][cnt1]==false){
                        visit[x2][y2][cnt1]=true;
                        q.add(new Pair(x2,y2,cnt1,p1.dst+1));
                    }
                }
            }

            for(int i=0; i<8; i++){
                int x2=x1+hx[i];
                int y2=y1+hy[i];
                int cnt1=p1.cnt+1;
                if(cnt1<=K&&x2>=0&&x2<H&&y2>=0&&y2<W){
                    if(dp[x2][y2]!=1&&visit[x2][y2][cnt1]==false){
                        visit[x2][y2][cnt1]=true;
                        q.add(new Pair(x2,y2,cnt1,p1.dst+1));
                    }
                }
            }
        }



    }


}
