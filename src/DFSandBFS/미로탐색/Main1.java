package DFSandBFS.미로탐색;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main1 {
    static int N;
    static  int M;
    static  int d_x[]={1,-1,0,0};
    static  int d_y[]={0,0,1,-1};
    static  int dp[][];
    static  boolean visit[][];
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        dp=new int[N][M];
        visit=new boolean[N][M];


        for(int i=0;i<N;i++) {
            String row = sc.next();
            for (int j = 0; j < M; j++) {
                dp[i][j] = row.charAt(j) - '0';
            }
        }



        bfs(0,0);
        System.out.println(dp[N-1][M-1]);

    }

    static void bfs(int x,int y){
        Queue<Integer>qx=new LinkedList<>();
        Queue<Integer>qy=new LinkedList<>();

        qx.add(x);
        qy.add(y);
        visit[x][y]=true;

        while (!qx.isEmpty()&&!qy.isEmpty()){
            int x2=qx.poll();
            int y2=qy.poll();

            for(int i=0; i<4; i++){
                int x1=x2+d_x[i];
                int y1=y2+d_y[i];
                if(x1>=0&&x1<N&&y1>=0&&y1<M){
                    if(visit[x1][y1]==false&&dp[x1][y1]!=0) {

                        qx.add(x1);
                        qy.add(y1);
                        visit[x1][y1] = true;
                        dp[x1][y1] = dp[x2][y2] + 1;
                    }

                }
            }


        }
    }

}
