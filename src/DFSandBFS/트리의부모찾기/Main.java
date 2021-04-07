package DFSandBFS.트리의부모찾기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int N;
    static ArrayList<Integer>map[];
    static boolean visit[];
    static int d[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        d=new int[N+1];
        map=new ArrayList[N+1];
        for(int i=1; i<=N; i++){
            map[i]=new ArrayList<>();
        }

        visit=new boolean[N+1];


        for(int i=0; i<N-1; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            map[a].add(b);
            map[b].add(a);
        }

        dfs(1);
        for(int i=2; i<=N; i++){
            System.out.println(d[i]);
        }


    }
    static void  dfs(int x) {
        visit[x]=true;
        for(int idx :map[x]){

            if(visit[idx]==false){
                d[idx]=x;
                dfs(idx);
            }


        }


    }

}
