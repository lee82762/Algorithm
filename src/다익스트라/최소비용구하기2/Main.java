package 다익스트라.최소비용구하기2;

import java.util.*;

public class Main {
    static int n;
    static  int m;
    static int d[];
    static int re[];
    static ArrayList<Pair>dp[];
    static class Pair implements Comparable<Pair> {
        int idx;
        int dis;
        public Pair(int idx,int dis){
            this.idx=idx;
            this.dis=dis;
        }
        public int compareTo(Pair p){
            return dis-p.dis;

        }
    }

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        d=new int[n+1];

        re=new int[n+1];

        dp=new ArrayList[n+1];
        Arrays.fill(d,100000000);
        for(int i=1; i<=n; i++){
            dp[i]=new ArrayList<>();
        }

        for(int i=0; i<m; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            dp[a].add(new Pair(b,c));
        }
        int s=sc.nextInt();
        int de=sc.nextInt();
        bfs(s,de);
        System.out.println(d[de]);
        //System.out.println(Arrays.toString(re));


        //역추적 잘생각하기
        Stack<Integer>st=new Stack<>();
        while (true){
            st.add(de);
            de=re[de];
            if(s==de){
                st.add(de);
                break;
            }

        }
        System.out.println(st.size());

        while (!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }


    }

    public static void bfs(int start,int dis){
        PriorityQueue<Pair>queue=new PriorityQueue<>();
        boolean check[]=new boolean[n+1];

        d[start]=0;
        queue.add(new Pair(start,d[start]));

        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x1=p1.idx;

            if(check[x1]==true) {
                continue;
            }
            check[x1]=true;

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
