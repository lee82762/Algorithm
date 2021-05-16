package DFSandBFS.치즈;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N;
    static  int M;
    static int map[][];
    static boolean visit[][];
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static class Pair{
        int x;
        int y;

        public Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    static int cheeze=0;
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        map=new int[N][M];
        visit=new boolean[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                map[i][j]=sc.nextInt();

                if(map[i][j]==1){
                    cheeze++;
                }
            }
        }

        int answer=0;
        int answer1=0;
        while (cheeze!=0){
            answer++;
            answer1=cheeze;
            visit=new boolean[N][M];
            bfs(0,0);


        }
        System.out.println(answer);
        System.out.println(answer1);







    }
    static void bfs(int x, int y){
        Queue<Pair>queue=new LinkedList<>();
        queue.add(new Pair(x,y));
        visit[x][y]=true;

        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x1=p1.x;
            int y1=p1.y;
            for(int i=0; i<4; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];
                if(x2>=0&&x2<N&&y2>=0&&y2<M){
                    if(visit[x2][y2]==false&&map[x2][y2]==1){
                        map[x2][y2]=0;
                        visit[x2][y2]=true;

                        cheeze--;
                    }
                    else if(visit[x2][y2]==false&&map[x2][y2]==0){
                        visit[x2][y2]=true;
                        queue.add(new Pair(x2,y2));
                    }
                }
            }
        }

    }

}

