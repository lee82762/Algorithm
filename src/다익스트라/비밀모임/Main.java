package 다익스트라.비밀모임;

import java.util.*;

public class Main {
    static int T;
    static int N;
    static int M;
    static int K;
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

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();
        for(int k=0; k<T; k++){
            N=sc.nextInt();
            M=sc.nextInt();
            d=new int[N+1];
            dp=new ArrayList[N+1];
            for(int i=1; i<=N; i++){
                d[i]=100000000;
                dp[i]=new ArrayList<Pair>();
            }

            for(int i=0; i<M; i++){
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();

                dp[a].add(new Pair(b,c));
                dp[b].add(new Pair(a,c));
            }
            K=sc.nextInt();
            int re[]=new int[K+1];
            for(int i=1; i<=K; i++){
                re[i]=sc.nextInt();
            }
            Arrays.sort(re);
            ArrayList<Integer>a1=new ArrayList<>();
            int answer=0;
            int max=0;
            int cnt=0;

            int min=100000000;
            int result=0;
            for (int i = 1; i <= N; i++) {
                bfs(i);
                // System.out.println(Arrays.toString(d));
                for(int j=1; j<=K; j++){
                    answer+=d[re[j]];
                }
                if(min>answer){
                    min=answer;
                    result=i;
                }
                answer=0;
                Arrays.fill(d,100000000);
            }
            System.out.println(result);

        }



    }
    static public void bfs(int start){
        PriorityQueue<Pair>queue=new PriorityQueue<>(new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o2.dis-o1.dis;
            }
        });
        d[start]=0;
        queue.add(new Pair(start,d[start]));

        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x1=p1.idx;
            int y1=p1.dis;
            for(Pair next:dp[x1]){
                if(d[next.idx]>d[x1]+next.dis){
                    d[next.idx]=d[x1]+next.dis;
                    queue.add(new Pair(next.idx,d[next.idx]));

                }
            }
        }


    }

}
