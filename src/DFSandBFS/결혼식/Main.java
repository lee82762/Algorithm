package DFSandBFS.결혼식;

import java.awt.*;
import java.util.*;

public class Main {
    static int cnt=0;
    static int N;
    static int M;
    static int dp[][];
    static boolean visit[];

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        dp=new int[N][N];
        visit=new boolean[N];
        for(int i=0; i<M; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            dp[a-1][b-1]=1;
            dp[b-1][a-1]=1;
        }
        bfs(0);
        System.out.println(cnt);

    }
    static public void bfs(int x){
        Queue<Point>qx=new LinkedList<>();
        qx.add(new Point(x,0));
        visit[x]=true;
        while (!qx.isEmpty()){
            Point p1=qx.poll();
            int x1=p1.x;
            int y1=p1.y;

            if(y1==2){
                break;
            }
            for(int i=0; i<N; i++){
                if(dp[x1][i]==1&&visit[i]==false){
                    visit[i]=true;
                    qx.add(new Point(i,y1+1));
                    cnt++;
                }
            }

        }



    }

}
