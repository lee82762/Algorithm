package 다익스트라.간선이어가기;


//시간초과 해결하기
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static int n;
    static int m;
    static int d[];
    static ArrayList<Pair>dp[];
    static int count=0;


    static class Pair {
        int idx;
        int dit;

        public Pair(int idx, int dit){
            this.idx=idx;
            this.dit=dit;
        }

    }

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();

        dp=new ArrayList[n+1];
        d=new int[n+1];

        for(int i=1; i<=n; i++){
            d[i]=100000000;
            dp[i]=new ArrayList<Pair>();
        }

        for(int i=0; i<m; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            dp[a].add(new Pair(b,c));
            dp[b].add(new Pair(a,c));

        }
        int s=sc.nextInt();
        int t=sc.nextInt();

        bfs(s,t);
        System.out.println(d[t]);
    }
    public static void bfs(int x, int y){
        PriorityQueue<Pair>queue=new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o2.dit-o1.dit;
            }
        });

        d[x]=0;
        queue.add(new Pair(x,d[x]));

        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x1=p1.idx;
            int y1=p1.dit;

            for(Pair next:dp[x1]){
                if(d[next.idx]>d[x1]+next.dit){
                    d[next.idx]=d[x1]+next.dit;
                    queue.add(new Pair(next.idx,d[next.idx]));

                }
            }
        }

    }
}
