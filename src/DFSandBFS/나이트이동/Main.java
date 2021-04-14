package DFSandBFS.나이트이동;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Main {
    static int T;
    static int N;
    static int dp[][];
    static boolean visit[][];
    static int answer=0;
    static  int dx[]={2,2,-2,-2,1,1,-1,-1};
    static  int dy[]={-1,1,1,-1,-2,2,-2,2};
    static class Pair{
        int x;
        int y;
        int cnt;
        public Pair(int x,int y,int cnt){
            this.x=x;
            this.y=y;
            this.cnt=cnt;

        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        T=sc.nextInt();
        for(int i=0; i<T; i++) {
            N=sc.nextInt();
            dp = new int[N][N];
            visit = new boolean[N][N];
            int a = sc.nextInt();
            int b = sc.nextInt();

            int c = sc.nextInt();
            int d = sc.nextInt();
            bfs(a, b, c, d);
            System.out.println(answer);
        }



    }
    static void bfs(int stx,int sty,int dex,int dey){
        Queue<Pair>queue=new LinkedList<>();
        visit[stx][sty]=true;

        queue.add(new Pair(stx,sty,0));
        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x1=p1.x;
            int y1=p1.y;
            int cnt1=p1.cnt;

            if(x1==dex&&y1==dey){
                answer=cnt1;
                return;
            }
            for(int i=0; i<8; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];

                if(x2>=0&&x2<N&&y2>=0&&y2<N){
                    if(visit[x2][y2]==false){
                        queue.add(new Pair(x2,y2,cnt1+1));
                        visit[x2][y2]=true;

                    }
                }

            }
        }

    }

}