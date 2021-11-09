package DFSandBFS.노드사이의거리문제;

import java.util.*;

public class Main {
    static int map[][];
    static boolean visit[];
    static int N,K;
    static int answer=0;
    static ArrayList<Pair> a1[];
    static class Pair{
        int idx;
        int dis;
        public Pair(int idx,int dis){
            this.idx=idx;
            this.dis=dis;
        }
    }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        K=sc.nextInt();
        a1= new ArrayList[N];
        for(int i=0; i<N; i++){
            a1[i]=new ArrayList<Pair>();
        }
        for(int i=0; i<N-1; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            a1[a-1].add(new Pair(b-1,c));
            a1[b-1].add(new Pair(a-1,c));
        }
        for(int i=0; i<K; i++){
            answer=0;
            visit=new boolean[N];
            int a=sc.nextInt();
            int b=sc.nextInt();
            dfs(a-1,b-1,0);
            System.out.println(answer);
        }
    }

    public static void dfs(int x, int y,int dis){
        if(x==y){
            answer = dis;
            return;
        }

        for(Pair next: a1[x]){
            if(visit[next.idx]==false){
                visit[x]=true;
                dfs(next.idx,y,dis+next.dis);

            }
        }

    }
}
