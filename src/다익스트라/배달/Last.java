package 다익스트라.배달;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
class Last {
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
    public int solution(int n, int[][] road, int k) {
        d=new int[n];
        dp=new ArrayList[n];
        Arrays.fill(d,100000000);
        for(int i=0; i<n; i++){
            dp[i]=new ArrayList<>();
        }

        for(int i=0; i<road.length; i++){
            int a=road[i][0]-1;
            int b=road[i][1]-1;
            int c=road[i][2];
            dp[a].add(new Pair(b,c));
            dp[b].add(new Pair(a,c));
        }
        dik(0);

        int answer=0;
        for(int i=0; i<d.length; i++){
            if(d[i]<=k){
                answer++;
            }
        }
        return answer;
    }
    static public void dik(int x){
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

            for(Pair next:dp[idx1]){
                if(d[next.idx]>d[idx1]+next.dis){
                    d[next.idx]=d[idx1]+next.dis;
                    queue.add(new Pair(next.idx,d[next.idx]));
                }
            }

        }

    }
}
