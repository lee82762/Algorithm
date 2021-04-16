package DFSandBFS.침투;

import java.util.*;

public class Main {
    static int N;
    static int M;
    static int dp[][];
    static boolean visit[][];
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        N=sc.nextInt();
        M=sc.nextInt();
        dp=new int[N][M];
        visit=new boolean[N][M];

        for(int i=0; i<N; i++){
            String s=sc.next();
            for(int j=0; j<M; j++){
                dp[i][j]=s.charAt(j)-'0';
            }
        }


        for(int i=0; i<M; i++){
            if(visit[0][i]==false&&dp[0][i]==0){
                bfs(0,i);
            }
        }
        int max=0;

        for(int i=0; i<M; i++){
            max=Math.max(max,dp[N-1][i]);
        }

        if(max==100){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }




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
                    if(visit[x2][y2]==false&&dp[x2][y2]==0){
                        qx.add(x2);
                        qy.add(y2);
                        dp[x2][y2]=100;
                        visit[x2][y2]=true;
                    }
                }
            }

        }




    }
}
