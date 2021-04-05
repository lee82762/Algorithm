package 다익스트라.카카오커머스문제3번;


//다익스트라 사용으로 쉽게 구할 수 있다.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    static  int w;
    static  int h;
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
        int n=5;
        int []pa={1,1,2,3,4};
        int train[][]={{1,2},{1,3},{1,4},{1,5}};

        d=new int[n+1];
        dp=new ArrayList[n+1];

        Arrays.fill(d,100000000);
        for(int i=1; i<=n; i++){
            dp[i]=new ArrayList<>();
        }

        for(int i=0; i<train.length; i++){
            int a=train[i][0];
            int b=train[i][1];
            int c=pa[i+1];
            dp[a].add(new Pair(b,c));
            dp[b].add(new Pair(a,c));
        }

        bfs(1,pa);
        int answer[]=new int [2];
        int max=0;
        for(int i=1; i<=n; i++){
            max=Math.max(max,d[i]);
        }


        int answer1=0;
        for(int i=1; i<=n; i++){
            if(max==d[i]){
                answer1=i;
            }
        }

        answer[0]=answer1;
        answer[1]=pa[0]+max;

        System.out.println(Arrays.toString(answer));

    }
    static void  bfs(int x,int []pa){
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



