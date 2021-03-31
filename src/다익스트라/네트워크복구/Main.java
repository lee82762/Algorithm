package 다익스트라.네트워크복구;

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
            dp[b].add(new Pair(a,c));
        }

        bfs(1);
        System.out.println(n-1);
        ArrayList<String>s1=new ArrayList<>();
        int start=1;
        for(int i=2; i<=n; i++) {
            int end=i;
            Stack<Integer> st = new Stack<>();
            while (true) {
                st.add(end);
                end = re[end];
                if (start == end) {
                    break;
                }


            }
            String st1="";

            if(st.size()==1){
                st1+="1";
                st1+=" ";
                st1+=Integer.toString(st.get(0));

            }
            else{
                st1+=Integer.toString(st.get(0));
                st1+=" ";
                st1+=Integer.toString(st.get(1));
            }
            s1.add(st1);

            st.clear();
        }
        for(int i=0; i<s1.size(); i++){
            System.out.println(s1.get(i));
        }





    }

    public static void bfs(int start){
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
