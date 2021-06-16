package 다익스트라.무엇을아느냐가;

import java.util.*;

//역추적 기억하기

public class Retry {
    static int T;
    static int N;
    static int M;
    static int d[];
    static int re[];
    static ArrayList<Pair>dp[];
    static class Pair {
        int idx;
        int dis;
        public Pair(int idx, int dis){
            this.idx=idx;
            this.dis=dis;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();
        for(int k=1; k<=T; k++) {
            N = sc.nextInt();
            M = sc.nextInt();
            d = new int[M];
            re = new int[M];
            Arrays.fill(d, 100000000);
            dp = new ArrayList[M];
            for (int i = 0; i < M; i++) {
                dp[i] = new ArrayList<>();
            }
            for (int i = 0; i < N; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                dp[a].add(new Pair(b, c));
                dp[b].add(new Pair(a, c));
            }


            bfs(0);


            Stack<Integer> st = new Stack<>();
            int end = M - 1;
            int start = 0;

            while (true) {
                st.add(end);
                end = re[end];
                if (end == start) {
                    st.add(end);
                    break;
                }
            }

            if (d[M - 1] == 100000000) {
                System.out.println("Case #"+k+": -1");
            } else {
                System.out.print("Case #"+k+": ");
                while (!st.isEmpty()) {
                    System.out.print(st.pop()+" ");
                }
            }
            System.out.println(" ");

        }




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
                    re[next.idx]=x1;
                }
            }

        }

    }
}
