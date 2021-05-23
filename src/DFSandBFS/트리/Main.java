package DFSandBFS.트리;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//그래프 이해하기
//그래프 연결 부모 자식 확인이 중요
// 다시 풀어보기

public class Main {
    static int N;
    static int d[];
    static boolean visit[];
    static int b;
    static int M;
    static ArrayList<Pair>dp[];
    static class Pair {
        int idx;
        public Pair(int idx){
            this.idx=idx;
        }
    }
    static int answer=0;



    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        d=new int[N];
        visit=new boolean[N];
        dp=new ArrayList[N];
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
            else{
                dp[i].add(new Pair(a));
                dp[a].add(new Pair(i));
            }
        }
        int M=sc.nextInt();
        bfs(M);
        answer=0;
        bfs(root);
        System.out.println(answer);





    }
    static void bfs(int start){
        Queue<Pair>queue=new LinkedList<>();

        if(visit[start]){
            return;
        }


        queue.add(new Pair(start));
        visit[start]=true;



        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            boolean flag=false;

            for(Pair next: dp[p1.idx]){
                if(visit[next.idx]==false&&d[p1.idx]!=next.idx){
                    flag=true;
                    visit[next.idx]=true;
                    queue.add(new Pair(next.idx));
                }
            }

            if(!flag){
                answer++;
            }
        }


    }
}
