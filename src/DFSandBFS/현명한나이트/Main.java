package DFSandBFS.현명한나이트;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int map[][];
    static boolean visit[][];
    static int X;
    static int Y;
    static int A;
    static int B;
    static int dx[]={-2,-2,-1,-1,2,2,1,1};
    static int dy[]={-1,1,-2,2,-1,1,-2,2};

    static class Pair{
        int x;
        int y;
        int cnt;
        public Pair(int x,int y,int cnt){
            this.x=x;
            this.y=y;
            this.cnt=cnt;
        }
    }
    static int answer=0;

    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        X=sc.nextInt();
        Y=sc.nextInt();
        ArrayList<Pair>a1=new ArrayList<>();
        map=new int[N][N];
        visit=new boolean[N][N];


        StringBuilder sb=new StringBuilder();
        for(int i=0; i<M; i++){
            A=sc.nextInt();
            B=sc.nextInt();
            a1.add(new Pair(A-1,B-1,0));
        }
        bfs(X-1,Y-1);


        for(int i=0; i<a1.size(); i++){
            Pair p1=a1.get(i);
            sb.append(map[p1.x][p1.y]+" ");
        }

        System.out.println(sb);


    }
    static void bfs(int x, int y){
        Queue<Pair>queue=new LinkedList<>();
        queue.add(new Pair(x,y,0));
        visit[x][y]=true;


        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x1=p1.x;
            int y1=p1.y;
            int cnt1=p1.cnt;

            for(int i=0; i<8; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];

                if(x2>=0&&x2<N&&y2>=0&&y2<N){
                    if(visit[x2][y2]==false){
                        map[x2][y2]=map[x1][y1]+1;
                        queue.add(new Pair(x2,y2,cnt1+1));
                        visit[x2][y2]=true;
                    }
                }
            }


        }




    }
}


