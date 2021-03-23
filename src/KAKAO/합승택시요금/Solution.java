package KAKAO.합승택시요금;
import java.util.*;

//정확성 100
//효율성 6.7
//다시 풀어보기

class Solution {
    static int V;
    static int E;
    static int P;
    static int d[];
    static int d1[];
    static ArrayList<Pair>dp[];
    static  class Pair{
        int idx;
        int dis;
        public Pair(int idx,int dis){
            this.idx=idx;
            this.dis=dis;
        }
    }
    public int solution(int n, int s, int a, int b, int[][] fares) {

        d=new int[n+1];
        dp=new ArrayList[n+1];
        for(int i=1; i<=n; i++){
            d[i]=100000000;
            dp[i]=new ArrayList<Pair>();
        }

        for(int i=0; i<fares.length; i++){
            dp[fares[i][0]].add(new Pair(fares[i][1],fares[i][2]));
            dp[fares[i][1]].add(new Pair(fares[i][0],fares[i][2]));
        }
        d1=new int[n+1];

        bfs(s,d);
        int min=100000000;
        int answer=0;
        for(int i=1; i<=n; i++){
            answer+=d[i];


            Arrays.fill(d1,100000000);
            bfs(i,d1);


            answer+=(d1[a]+d1[b]);
            if(min>answer){
                min=answer;
            }

            answer=0;



        }

        return min;
    }

    static public void bfs(int x,int re[]){

        PriorityQueue<Pair>queue=new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o2.dis-o1.dis;
            }
        });
        re[x]=0;
        queue.add(new Pair(x,re[x]));

        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x1=p1.idx;
            for(Pair next: dp[x1]){

                if(re[next.idx]>re[x1]+next.dis){
                    re[next.idx]=re[x1]+next.dis;
                    queue.add(new Pair(next.idx,re[next.idx]));
                }
            }
        }

    }
}
