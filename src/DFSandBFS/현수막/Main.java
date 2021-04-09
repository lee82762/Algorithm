package DFSandBFS.현수막;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int M;
    static int N;
    static  int dx[]={1,-1,0,0,1,1,-1,-1};
    static  int dy[]={0,0,1,-1,1,-1,1,-1};
    static  boolean visit[][];
    static  int dp[][];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        M=sc.nextInt();
        N=sc.nextInt();
        visit=new boolean[M][N];
        dp=new int[M][N];
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                dp[i][j]=sc.nextInt();
            }
        }
        int answer=0;

        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(dp[i][j]==1&&visit[i][j]==false){
                    bfs(i,j);
                    answer++;
                }
            }

        }
        System.out.println(answer);





    }
    static void  bfs(int x,int y) {
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
                if(x2>=0&&x2<M&&y2>=0&&y2<N){
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
