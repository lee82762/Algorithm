package DFSandBFS.데스나이트;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int answer=0;
    static int N;
    static int a;
    static int b;
    static int c;
    static int d;
    static int dp[][];
    static int dx[]={-2,-2,0,0,2,2};
    static int dy[]={-1,1,-2,2,-1,1};
    static boolean visit[][];
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
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        dp=new int[N][N];
        visit=new boolean[N][N];

        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();

        bfs(a,b);
        if(answer==0){
            answer=-1;
        }
        System.out.println(answer);



    }
    static void bfs(int x,int y){
        Queue<Pair>queue=new LinkedList<>();
        queue.add(new Pair(x,y,0));
        visit[x][y]=true;

        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x1=p1.x;
            int y1=p1.y;
            int cnt1=p1.cnt;
            if(x1==c&&y1==d){
                answer=cnt1;
            }

            for(int i=0; i<6; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];

                if(x2>=0&&x2<N&&y2>=0&&y2<N){
                    if(!visit[x2][y2]){
                        queue.add(new Pair(x2,y2,cnt1+1));
                        visit[x2][y2]=true;
                    }
                }
            }
        }



    }
}
