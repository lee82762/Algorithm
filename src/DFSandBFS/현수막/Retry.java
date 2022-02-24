package DFSandBFS.현수막;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Retry {
    static int dx[]={1,-1,0,0,1,1,-1,-1};
    static int dy[]={0,0,1,-1,1,-1,1,-1};
    static int N;
    static int M;
    static int arr[][];
    static boolean visit[][];
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        arr=new int[N][M];
        visit=new boolean[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int answer=0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(visit[i][j]==false && arr[i][j]==1){
                    bfs(i,j);
                    answer++;
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

        while (!qx.isEmpty() && !qy.isEmpty()){
            int x1=qx.poll();
            int y1=qy.poll();

            for(int i=0; i<8; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];

                if(x2>=0 && x2<N && y2>=0 && y2<M){
                    if(visit[x2][y2]==false && arr[x2][y2]==1){
                        qx.add(x2);
                        qy.add(y2);
                        visit[x2][y2]=true;
                    }
                }
            }
        }
    }
}
