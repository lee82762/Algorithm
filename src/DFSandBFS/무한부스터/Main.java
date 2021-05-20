package DFSandBFS.무한부스터;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int map[][];
    static boolean visit[][];
    static int dx[] = { 1,0 };
    static int dy[] = { 0, 1};
    static class Pair{
        int x;
        int y;
        int boot;
        int cnt;
        public Pair(int x, int y,int boot ,int cnt){
            this.x=x;
            this.y=y;
            this.boot=boot;
            this.cnt=cnt;
        }
    }
    static int answer=0;
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        map=new int[N][M];
        visit=new boolean[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                map[i][j]=sc.nextInt();
            }
        }
        bfs(0,0);
        System.out.println(answer);


    }
    static void bfs(int x,int y){
        Queue<Pair>queue=new LinkedList<>();
        queue.add(new Pair(x,y,map[x][y],0));
        visit[x][y]=true;

        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x1=p1.x;
            int y1=p1.y;
            int boot1=p1.boot;
            int cnt1=p1.cnt;
            if(x1==N-1&&y1==M-1){
                answer=cnt1;
                break;
            }
            int tm=1;
            for(int i=0; i<2; i++){
                for(int j=1; j<=boot1; j++) {

                    int x2 = x1 + (dx[i] * j);
                    int y2 = y1 + (dy[i] * j);


                    if (x2 >= 0 && x2 < N && y2 >= 0 && y2 < M) {
                        if (visit[x2][y2] == false) {
                            queue.add(new Pair(x2, y2, map[x2][y2], cnt1 + 1));
                            visit[x2][y2] = true;
                        }
                    }
                }

            }


        }

    }
}