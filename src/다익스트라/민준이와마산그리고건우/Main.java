package 다익스트라.민준이와마산그리고건우;

import java.util.*;

public class Main {

    static int V;
    static int E;
    static int P;
    static int d[];
    static ArrayList<Pair>dp[];
    static  class Pair{
        int idx;
        int dis;
        public Pair(int idx,int dis){
            this.idx=idx;
            this.dis=dis;
        }
    }

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        V=sc.nextInt();
        E=sc.nextInt();
        P=sc.nextInt();

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
            dp[b].add(new Pair(a,c));
        }
        bfs(1,P);
        int a1=d[P];

        Arrays.fill(d,100000000);

        bfs(P,V);
        int a2=d[V];

        Arrays.fill(d,100000000);

        bfs(1,V);
        int a3=d[V];

        Arrays.fill(d,100000000);

        if(a1+a2>a3){
            System.out.println("GOOD BYE");
        }
        else{
            System.out.println("SAVE HIM");
        }



    }
    static void bfs(int x,int target){
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
            int y1=p1.dis;
            if(x1==target){
                return;
            }

            for(Pair next :dp[x1]){
                if(d[next.idx]>d[x1]+next.dis){
                    d[next.idx]=d[x1]+next.dis;
                    queue.add(new Pair(next.idx,d[next.idx]));
                }

            }
        }


    }


}
