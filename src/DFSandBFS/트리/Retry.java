package DFSandBFS.트리;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Retry{
    static int N;
    static ArrayList<Integer>dp[];
    static int d[];
    static boolean visit[];
    static int S;
    static int answer=0;
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        d=new int[N];
        dp=new ArrayList[N];
        visit=new boolean[N];
        for(int i=0; i<N; i++){
            dp[i]=new ArrayList<>();
        }
        for(int i=0; i<N; i++){
            int a=sc.nextInt();
            d[i]=a;
        }
        int root=0;
        for(int i=0; i<N; i++){
            int a=d[i];
            if(a==-1){
                root=i;
                continue;
            }
            dp[i].add(a);
            dp[a].add(i);
        }

        S=sc.nextInt();
        bfs(S);
        answer=0;
        bfs(root);

        System.out.println(answer);





    }
    static void bfs(int start){
        Queue<Integer>queue=new LinkedList<>();

        if(visit[start]){
            return;
        }

        queue.add(start);
        visit[start]=true;

        while (!queue.isEmpty()){
            boolean flag=false;
            int x1=queue.poll();

            for(Integer next:dp[x1]){
                if(visit[next]==false&&d[x1]!=next){
                    queue.add(next);
                    visit[next]=true;
                    flag=true;
                }
            }

            if(!flag){
                answer++;
            }
        }


    }
}