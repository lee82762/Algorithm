package DFSandBFS.유기농배추;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main1 {
    static int T;
    static int N;
    static int M;
    static int K;
    static int dp[][];
    static boolean visit[][];
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();
        for(int k=0; k<T; k++) {
            M = sc.nextInt();
            N = sc.nextInt();
            K = sc.nextInt();

            dp = new int[M][N];
            visit = new boolean[M][N];
            for (int i = 0; i < K; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                dp[a][b] = 1;
            }
            int cnt = 0;
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (visit[i][j] == false && dp[i][j] != 0) {
                        bfs(i, j);
                        cnt++;
                    }
                }

            }
            System.out.println(cnt);
        }
    }
    static void bfs(int x,int y){
        Queue<Integer>qx=new LinkedList<>();
        Queue<Integer>qy=new LinkedList<>();

        qx.add(x);
        qy.add(y);
        visit[x][y]=true;
        while (!qx.isEmpty()&&!qy.isEmpty()) {
            int x1 = qx.poll();
            int y1 = qy.poll();
            for (int i = 0; i < 4; i++) {
                int x2=x1+dx[i];
                int y2=y1+dy[i];
                if(x2>=0&&x2<M&&y2>=0&&y2<N){
                    if(visit[x2][y2]==false&&dp[x2][y2]!=0){
                        qx.add(x2);
                        qy.add(y2);
                        visit[x2][y2]=true;
                        dp[x2][y2]=dp[x1][y1]+1;
                    }
                }

            }
        }

    }

}
