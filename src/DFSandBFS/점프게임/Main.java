package DFSandBFS.점프게임;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int answer=0;
    static int N;
    static int K;
    static int map[][];
    static boolean visit[][];
    static int dx[]={0,0};
    static int dy[]={1,-1};
    static int dx1[]={1,-1};
    static int dy1[]={0,0};
    static class Pair{
        int x;
        int y;
        int cnt;
        public Pair(int x, int y, int cnt){
            this.x=x;
            this.y=y;
            this.cnt=cnt;
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        K=sc.nextInt();
        map=new int[2][N+1];
        visit=new boolean[2][N+1];
        for(int i=0; i<2; i++){
            String s=sc.next();
            for(int j=0; j<N; j++){
                map[i][j]=Integer.parseInt(String.valueOf(s.charAt(j)));
            }
        }
        bfs(0,0);
        System.out.println(answer);
    }
    static public void bfs(int x, int y){
        Queue<Pair>queue=new LinkedList<>();
        queue.add(new Pair(x,y,0));
        visit[x][y]=true;

        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x1=p1.x;
            int y1=p1.y;
            int cnt1=p1.cnt;

            if(y1+K>=N){
                answer=1;
                break;
            }

            for(int i=0; i<2; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];

                if(x2>=0 && x2<2 && y2>=0 && y2<100000){
                    if(visit[x2][y2]==false && map[x2][y2]==1){
                        queue.add(new Pair(x2,y2,cnt1+1));
                        visit[x2][y2]=true;
                    }
                }
            }

            for(int i=0; i<2; i++){
                int x2=x1+dx1[i];
                int y2=y1+dy1[i]+K;

                if(x2>=0 && x2<2 && y2>=0 && y2<100000){
                    if(visit[x2][y2]==false && map[x2][y2]==1){
                        queue.add(new Pair(x2,y2,cnt1+1));
                        visit[x2][y2]=true;

                    }
                }
            }

            for(int i=0; i<2; i++){
                visit[i][cnt1]=true;
            }
        }
    }
}
