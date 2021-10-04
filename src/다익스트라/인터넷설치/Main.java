package 다익스트라.인터넷설치;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static int N;
    static int W;
    static int L;
    static ArrayList<Pair>dp[];
    static int d[];
    static  int INF = 987654321;

    static class Pair{
        int idx;
        int dis;
        public  Pair (int idx,int dis){
            this.idx=idx;
            this.dis=dis;
        }
    }
    public static void main(String argp[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        W=sc.nextInt();
        L=sc.nextInt();
        dp=new ArrayList[N+1];
        d=new int[N+1];
        for(int i=1; i<=N; i++){
            d[i]=1000000001;
            dp[i]=new ArrayList<>();
        }
        int right=0;
        for(int i=0; i<W; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            dp[a].add(new Pair(b,c));
            dp[b].add(new Pair(a,c));
            right=Math.max(right,c);

        }
        int firtst=0;
        int ans=-1;
        while (firtst<=right){
            int mid=(firtst+right)/2;
            if(dik(mid)){
                right=mid-1;
                ans=mid;

            }
            else{
                firtst=mid+1;
            }
        }
        System.out.println(ans);

    }
    static public boolean dik(int x){
        PriorityQueue<Pair>queue=new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.dis-o2.dis;
            }
        });
        for(int i=1; i<=N; i++){
            d[i]=1000000001;
        }
        d[1]=0;
        queue.add(new Pair(1,0));

        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x1=p1.idx;
            int y1=p1.dis;

            for(Pair next:dp[x1]){
                int nextCost=y1;
                if(next.dis>x){
                    nextCost+=1;
                }
                if(d[next.idx]>nextCost){
                    d[next.idx]=nextCost;
                    queue.add(new Pair(next.idx,d[next.idx]));
                }
            }
        }
        return d[N]<=L;
    }
}