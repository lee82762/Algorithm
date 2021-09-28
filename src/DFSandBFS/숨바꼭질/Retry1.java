package DFSandBFS.숨바꼭질;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Retry1 {
    static int N;
    static int K;
    static int dx[]={1,-1,2};
    static int []map;
    static boolean []visit;
    static class Pair{
        int idx;
        int dis;
        public Pair(int idx,int dis){
            this.idx=idx;
            this.dis=dis;
        }
    }

    static int answer=0;
    public static void main(String argp[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        K=sc.nextInt();
        map=new int[100001];
        visit=new boolean[100001];
        bfs();
        System.out.println(answer);

    }
    public static void bfs(){
        Queue<Pair>qx=new LinkedList<>();
        qx.add(new Pair(N,0));
        visit[N]=true;

        while (!qx.isEmpty()){
            Pair p1=qx.poll();
            int idx1=p1.idx;
            int dis1=p1.dis;

            if(idx1==K){
                answer=dis1;
                break;
            }

            for(int i=0; i<3; i++){
                int idx2=0;
                if(i==2){
                    idx2=idx1*dx[i];
                }
                else{
                    idx2=idx1+dx[i];
                }
                if(idx2>=0&&idx2<100001) {
                    if(visit[idx2]==false){
                        qx.add(new Pair(idx2,dis1+1));
                        visit[idx2]=true;
                    }
                }
            }
        }

    }
}
