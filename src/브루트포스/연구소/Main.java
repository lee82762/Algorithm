package 브루트포스.연구소;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main{
    static int N;
    static int M;
    static int [][]map;
    static boolean [][]visit;
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
    static int answer=0;


    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        map=new int[N][M];

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                map[i][j]=sc.nextInt();
            }
        }

        dfs(0);
        System.out.println(answer);


    }


    static void dfs(int cnt){
        if(cnt==3){
            bfs();
            return;
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(map[i][j]==0){
                    map[i][j]=1;
                    dfs(cnt+1);
                    map[i][j]=0;
                }
            }
        }
    }

    static void bfs() {
        Queue<Pair>queue=new LinkedList<>();
        int temp[][]=new int[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                temp[i][j]=map[i][j];
            }
        }




        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(temp[i][j]==2){
                    queue.add(new Pair(i,j));
                }
            }
        }


        while (!queue.isEmpty()){
            Pair p1=queue.poll();

            int x1=p1.x;
            int y1=p1.y;

            for(int i=0; i<4; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];

                if(x2>=0&&x2<N&&y2>=0&&y2<M){
                    if(temp[x2][y2]==0){
                        temp[x2][y2]=2;
                        queue.add(new Pair(x2,y2));


                    }
                }
            }

        }

        int re=0;

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){

                if(temp[i][j]==0){
                    re++;
                }

            }
        }
        answer=Math.max(answer,re);



    }
}
