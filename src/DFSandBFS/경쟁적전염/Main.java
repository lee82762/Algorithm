package DFSandBFS.경쟁적전염;

import java.util.*;

public class Main {
    static int N;
    static int K;
    static int S;
    static int X;
    static int Y;
    static int map[][];
    static boolean visit[][];
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};


    static class Pair implements Comparable<Pair> {
        int x;
        int y;
        int time;
        int idx;

        public Pair(int x,int y,int idx, int time){
            this.x=x;
            this.y=y;
            this.idx=idx;
            this.time=time;
        }

        //비교한다.
        @Override
        public int compareTo(Pair o) {
            return idx-o.idx;
        }
    }


    static LinkedList<Pair>queue=new LinkedList<>();

    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        K=sc.nextInt();
        map=new int[N][N];
        visit=new boolean[N][N];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                map[i][j]=sc.nextInt();
            }
        }
        S=sc.nextInt();
        X=sc.nextInt();
        Y=sc.nextInt();

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(map[i][j]!=0){
                    queue.add(new Pair(i,j,map[i][j],0));

                }
            }
        }
        Collections.sort(queue); //작은 순서대로 삽입하기 위해서



        bfs();


        System.out.println(map[X-1][Y-1]);



    }
    static void bfs(){

        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x1=p1.x;
            int y1=p1.y;
            int idx1=p1.idx;
            int time1=p1.time;

            if(S==time1){
                break;
            }



            for(int i=0; i<4; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];

                if(x2>=0&&x2<N&&y2>=0&&y2<N){
                    if(visit[x2][y2]==false&&map[x2][y2]==0){
                        map[x2][y2]=idx1;
                        queue.add(new Pair(x2,y2,idx1,time1+1));
                        visit[x2][y2]=true;
                    }

                }
            }

        }

    }
}
