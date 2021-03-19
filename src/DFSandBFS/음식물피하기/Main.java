package DFSandBFS.음식물피하기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int cnt=0;
    static int N;
    static int M;
    static int K;
    static int dp[][];
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};

    static boolean visit[][];
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        K=sc.nextInt();
        dp=new int[N][M];
        visit=new boolean[N][M];

        for(int i=0; i<K; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            dp[a-1][b-1]=1;
        }

        int answer=0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(visit[i][j]==false&&dp[i][j]==1){
                    bfs(i,j);
                    answer=Math.max(answer,cnt+1);

                    cnt=0;
                }

            }
        }
        System.out.println(answer);





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
            for(int i=0; i<4; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];

                if(x2>=0&&x2<N&&y2>=0&&y2<M){
                    if(dp[x2][y2]==1&&visit[x2][y2]==false){
                        visit[x2][y2]=true;
                        qx.add(x2);
                        qy.add(y2);
                        cnt++;

                    }
                }
            }
        }
    }




}
