package DFSandBFS.보물섬;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int answer=0;
    static int N;
    static int M;
    static String [][]map;
    static boolean visit[][];
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static class Pair {
        int x;
        int y;
        int cnt;
        public Pair(int x, int y, int cnt){
            this.x=x;
            this.y=y;
            this.cnt=cnt;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();

        map=new String[N][M];
        visit=new boolean[N][M];

        for(int i=0; i<N; i++){
            String s=sc.next();
            for(int j=0; j<M; j++){
                map[i][j]=String.valueOf(s.charAt(j));
            }
        }


        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(map[i][j].equals("L")){
                    visit=new boolean[N][M];
                    int re=bfs(i,j);
                    answer=Math.max(answer,re);
                }
            }

        }

        System.out.println(answer);



    }
    static int  bfs(int x, int y){
        visit=new boolean[N][M];
        Queue<Pair>queue=new LinkedList<>();
        int val=0;
        queue.add(new Pair(x,y,0));
        visit[x][y]=true;

        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x1=p1.x;
            int y1=p1.y;
            int cnt1=p1.cnt;

            for(int i=0; i<4; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];
                if(x2>=0&&x2<N&&y2>=0&&y2<M){
                    if(visit[x2][y2]==false&&map[x2][y2].equals("L")){
                        queue.add(new Pair(x2,y2,cnt1+1));
                        val=Math.max(val,cnt1+1);
                        visit[x2][y2]=true;
                    }
                }
            }
        }
        return val;



    }



}
