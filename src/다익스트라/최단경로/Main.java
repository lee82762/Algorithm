package 다익스트라.최단경로;

import java.util.*;

public class Main {
    static int V;
    static int E;
    static int K;
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
        V=sc.nextInt();
        E=sc.nextInt();
        K=sc.nextInt();

        d=new int[V+1];
        dp=new ArrayList[V+1];


        for(int i=1; i<=V; i++){
            d[i]=100000000;
            dp[i]=new ArrayList<Pair>();
        }

        for(int i=0; i<E; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            dp[a].add(new Pair(b,c));
        }

        bfs(K);

        for(int i=1; i<=V; i++) {
            if(d[i] == 100000000)
                System.out.println("INF");
            else
                System.out.println(d[i]);
        }



    }
    static public void bfs(int x){
        PriorityQueue<Pair>queue=new PriorityQueue<Pair>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.dis-o2.dis;
            }
        });


        d[x]=0;
        queue.add(new Pair(x,d[x]));

        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            for(Pair next : dp[p1.idx]){

                if(d[next.idx]>d[p1.idx]+next.dis){
                    d[next.idx]=d[p1.idx]+next.dis;
                    queue.add(new Pair(next.idx,d[next.idx]));
                }
            }

        }

    }

}
