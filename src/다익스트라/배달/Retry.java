package 다익스트라.배달;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
class Retry {
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
    public int solution(int N, int[][] road, int K) {
        dp=new ArrayList[N+1];
        d=new int[N+1];
        for(int i=1; i<=N; i++){
            dp[i]=new ArrayList<>();
        }
        Arrays.fill(d,Integer.MAX_VALUE);
        for(int i=0; i<road.length; i++){
            int a=road[i][0];
            int b=road[i][1];
            int c=road[i][2];
            dp[a].add(new Pair(b,c));
            dp[b].add(new Pair(a,c));
        }
        dik(1);
        int answer=0;
        for(int i=1; i<=N; i++){
            if(d[i]<=K){
                answer++;
            }
        }
        return answer;
    }
    static void dik(int x){
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
            int idx1=p1.idx;
            int dis1=p1.dis;
            for(Pair next:dp[idx1]){
                if(d[next.idx]>d[idx1]+next.dis){
                    d[next.idx]=d[idx1]+next.dis;
                    queue.add(new Pair(next.idx,d[next.idx]));
                }
            }
        }

    }
}
