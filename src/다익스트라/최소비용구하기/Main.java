package 다익스트라.최소비용구하기;

import java.util.*;

public class Main {
    static int N;
    static int M;
    static int d[];//거리값입력
    static ArrayList<Pair>dp[];//가중치 담은 간선

    static class Pair{
        int idx;
        int dis;

        public Pair(int idx,int dis){
            this.idx=idx;
            this.dis=dis;
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        d=new int[N+1];
        dp=new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            d[i]=100000000;
            dp[i]=new ArrayList<Pair>();
        }
        for(int i=0; i<M; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            dp[a].add(new Pair(b,c));

        }
        int start=sc.nextInt();
        int end=sc.nextInt();
        bfs(start,end);
        System.out.println(d[end]);

    }
    static public void bfs(int start,int end){
        PriorityQueue<Pair>queue=new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.dis-o2.dis;
            }
        });
        d[start]=0;
        queue.add(new Pair(start,d[start]));

        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x1=p1.idx;
            for(Pair next: dp[x1]){
                if(d[next.idx]>d[x1]+next.dis){
                    d[next.idx]=d[x1]+next.dis;
                    queue.add(new Pair(next.idx,d[next.idx]));
                }
            }
        }

    }

}
