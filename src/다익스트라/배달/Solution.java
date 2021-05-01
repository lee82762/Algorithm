package 다익스트라.배달;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class Solution {
    //간선나오는 문제 가중치 문제 다이스트라
    static int d[];
    static ArrayList<Pair>dp[];
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
        Arrays.fill(d,100000000);

        for(int i=1; i<=N; i++){
            dp[i]=new ArrayList<>();
        }

        for(int i=0; i<road.length; i++){
            int a=road[i][0];
            int b=road[i][1];
            int c=road[i][2];

            dp[a].add(new Pair(b, c));
            dp[b].add(new Pair(a, c));

        }
        bfs(1);

        int answer=0;
        for(int i=0; i<d.length; i++){
            if(d[i]<=K){
                answer++;
            }
        }

        return answer;
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
