package DFSandBFS.유기농배추;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int K;
    static int T;
    static int [][]map;
    static boolean visit[][];
    static int []px={0,0,1,-1};
    static int []py={1,-1,0,0};
    static int count=0;
    static Queue<Integer>qx=new LinkedList<>();
    static Queue<Integer>qy=new LinkedList<>();

    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        T=sc.nextInt();
        for(int k=0; k<T; k++){
            M=sc.nextInt();
            N=sc.nextInt();
            K=sc.nextInt();
            map=new int[M][N];
            visit=new boolean[M][N];
            for(int i=0; i<K; i++){
                int n1=sc.nextInt();
                int m1=sc.nextInt();
                map[n1][m1]=1;
            }
            int cnt=0;
            for(int i=0; i<M; i++){
                for(int j=0; j<N; j++){
                    if(map[i][j]==1&&visit[i][j]==false){
                        cnt++;
                        bfs(i,j);
                    }
                }
            }
            System.out.println(cnt);

        }

    }
    public static void bfs(int x2, int y2){
        qx.add(x2);
        qy.add(y2);

        while (!qx.isEmpty()&&!qy.isEmpty()){
            x2=qx.poll();
            y2=qy.poll();
            visit[x2][y2]=true;

            for(int i=0; i<4; i++){
                int x1=x2+px[i];
                int y1=y2+py[i];
                if(x1>=0&&y1>=0&&x1<M&&y1<N){
                    if(!visit[x1][y1]&&map[x1][y1]==1){
                        qx.add(x1);
                        qy.add(y1);
                        visit[x1][y1]=true;

                    }
                }

            }
        }

    }
}
