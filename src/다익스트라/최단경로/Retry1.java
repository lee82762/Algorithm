package 다익스트라.최단경로;

import java.util.*;

public class Retry1 {
    static int V;
    static int E;
    static int d[];
    static ArrayList<Pair>dp[];
    static class Pair {
        int idx;
        int dis;
        public Pair(int idx, int dis){
            this.idx=idx;
            this.dis=dis;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        V=sc.nextInt();
        E=sc.nextInt();
        int T=sc.nextInt();
        d=new int[V+1];
        Arrays.fill(d,100000000);
        dp=new ArrayList[V+1];
        for(int i=1; i<=V; i++){
            dp[i]=new ArrayList<>();
        }

        for(int i=0; i<E; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            dp[a].add(new Pair(b,c));
        }
        bfs(T);
        for(int i=1; i<=V; i++){
            if(d[i]==100000000){
                System.out.println("INF");
                continue;
            }
            System.out.println(d[i]);
        }
    }
    static void bfs(int x){
        PriorityQueue<Pair>queue=new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.dis-o2.dis;
            }
        });
        d[x]=0;
        queue.add(new Pair(x,d[x]));

        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x1=p1.idx;

            for(Pair next:dp[x1]){
                if(d[next.idx]>d[x1]+next.dis){
                    d[next.idx]=d[x1]+next.dis;
                    queue.add(new Pair(next.idx,d[next.idx]));
                }
            }

        }

    }
}