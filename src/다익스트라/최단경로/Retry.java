package 다익스트라.최단경로;

import java.util.*;


public class Retry {
    static int V;
    static int E;
    static int K;
    static int d[];
    static ArrayList<Pair>dp[];
    static class Pair{
        int x;
        int cnt;
        public Pair(int x,  int cnt){
            this.x=x;
            this.cnt=cnt;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        V=sc.nextInt();
        E=sc.nextInt();
        K=sc.nextInt();
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
        bfs(K);
        for(int i=1; i<=V; i++){
            if(d[i]==100000000){
                System.out.println("INF");
            }
            else{
                System.out.println(d[i]);
            }
        }


    }
    static void bfs(int x){
        PriorityQueue<Pair>queue=new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.cnt-o2.cnt;
            }
        });
        d[x]=0;
        queue.add(new Pair(x,d[x]));

        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x1=p1.x;
            for(Pair next: dp[x1]){
                if(d[next.x]>d[x1]+next.cnt){
                    d[next.x]=d[x1]+next.cnt;
                    queue.add(new Pair(next.x,d[next.x]));
                }
            }
        }

    }

}
