package 다익스트라.특정한최단경로;

import java.util.*;

public class Main {
    static  int N;
    static  int E;
    static ArrayList<Pair>dp[];
    static int d[];
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
        E=sc.nextInt();

        d=new int[N+1];
        dp=new ArrayList[N+1];
        Arrays.fill(d,100000000);
        for(int i=1; i<=N; i++){
            dp[i]=new ArrayList<>();
        }

        for(int i=0; i<E; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            dp[a].add(new Pair(b,c));
            dp[b].add(new Pair(a,c));
        }
        int re1=sc.nextInt();
        int re2=sc.nextInt();
        int a1[]=new int[3];
        bfs(1,re1);
        a1[0]=d[re1];
        Arrays.fill(d,100000000);
        bfs(re1,re2);
        a1[1]=d[re2];
        Arrays.fill(d,100000000);
        bfs(re2,N);
        a1[2]=d[N];

        int result1=a1[0]+a1[1]+a1[2];

        a1=new int[3];

        Arrays.fill(d,100000000);
        bfs(1,re2);
        a1[0]=d[re2];

        Arrays.fill(d,100000000);
        bfs(re2,re1);
        a1[1]=d[re1];

        Arrays.fill(d,100000000);
        bfs(re1,N);
        a1[2]=d[N];

        int result2=a1[0]+a1[1]+a1[2];


        int ans = (result1 >= 100000000 && result2 >= 100000000) ? -1 : Math.min(result1, result2);
        System.out.println(ans);


    }
    static void  bfs(int x,int de){

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


            for(Pair next: dp[x1]){
                if(d[next.idx]>d[x1]+next.dis){
                    d[next.idx]=d[x1]+next.dis;
                    queue.add(new Pair(next.idx,d[next.idx]));
                }
            }
        }

    }



}
