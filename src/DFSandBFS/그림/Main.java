package DFSandBFS.그림;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//bfs를 통해 값을 구현

public class Main {
    static int N;
    static int M;
    static int cnt=0;
    static int dp[][];
    static boolean visit[][];
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static int cnt1=0;

    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();

        dp=new int[N][M];
        visit=new boolean[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                dp[i][j]=sc.nextInt();
            }
        }
        int max=0;


        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(visit[i][j]==false&&dp[i][j]!=0){
                    cnt++;
                    bfs(i,j);
                    max=Math.max(max,cnt1+1);
                    cnt1=0;
                }
            }

        }


        System.out.println(cnt);
        System.out.println(max);
    }
    static void bfs(int x,int y){
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
                    if(dp[x2][y2]!=0&&visit[x2][y2]==false){
                        visit[x2][y2]=true;
                        qx.add(x2);
                        qy.add(y2);
                        cnt1++;
                    }
                }
            }
        }




    }

}
