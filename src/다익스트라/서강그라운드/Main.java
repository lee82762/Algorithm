package 다익스트라.서강그라운드;

import java.util.*;


public class Main{
    static int answer=0;
    static int n;
    static int m;
    static int r;
    static int item[];
    static int d[];
    static ArrayList<Pair>dp[];
    static class Pair implements Comparable<Pair>{
        int idx;
        int des;
        public Pair(int idx, int des){
            this.idx=idx;
            this.des=des;
        }

        @Override
        public int compareTo(Pair arg0) {
            return des - arg0.des;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        r=sc.nextInt();
        dp=new ArrayList[n+1];
        for(int i=1; i<=n; i++){
            dp[i]=new ArrayList<>();
        }
        d=new int[n+1];

        item=new int[n+1];
        for(int i=1; i<=n; i++){
            item[i]=sc.nextInt();
        }
        for(int i=0; i<r; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            dp[a].add(new Pair(b,c));
            dp[b].add(new Pair(a,c));
        }
        Arrays.fill(d,100000000);

        int max=0;
        for(int i=1; i<=n; i++){
            answer=0;
            Arrays.fill(d,100000000);
            bfs(i);
            for(int j=1; j<=n; j++){
                if(d[j]<=m){
                    answer+=item[j];
                }
            }
            max=Math.max(max,answer);

        }
        System.out.println(max);


    }
    static void bfs(int x){


        PriorityQueue<Pair>queue=new PriorityQueue<>();

        d[x]=0;
        queue.add(new Pair(x,d[x]));

        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int idx1=p1.idx;
            for(Pair next:dp[idx1]){
                if(d[next.idx]>d[idx1]+next.des){

                    d[next.idx]=d[idx1]+next.des;
                    queue.add(new Pair(next.idx,d[next.idx]));
                }
            }
        }


    }


}

