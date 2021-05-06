package DFSandBFS.연결요소의개수;

import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int dp[][];
    static boolean visit[];
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        dp=new int[N+1][N+1];
        visit=new boolean[N+1];

        for(int i=0; i<M; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();

            dp[a][b]=1;
            dp[b][a]=1;

        }
        int answer=0;


        for(int i=1; i<=N; i++){
            if(!visit[i]){
                dfs(i);
                answer++;
            }

        }
        System.out.println(answer);


    }
    static void dfs(int x){
        visit[x]=true;

        for(int i=1; i<=N; i++){
            if(dp[x][i]==1&&visit[i]==false){
                visit[i]=true;
                dfs(i);

            }
        }

    }
}

