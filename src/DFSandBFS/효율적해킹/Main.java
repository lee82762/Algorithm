package DFSandBFS.효율적해킹;

import java.util.Scanner;

//DFS 메모리 초과 해결하기
public class Main {
    static int N;
    static int M;
    static int cnt=0;

    static int dp[][];
    static boolean visit[][];

    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        N=sc.nextInt();
        M=sc.nextInt();
        dp=new int[N][N];
        visit=new boolean[N][N];

        for(int i=0; i<M; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            dp[b-1][a-1]=1;
        }
        int max=0;

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(visit[i][j]==false){
                    dfs(i,j);
                    max=Math.max(max,cnt);

                    cnt=0;
                }
            }
        }

        visit=new boolean[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(visit[i][j]==false){
                    dfs(i,j);
                    if(max==cnt){
                        sb.append((i+1)+" ");
                    }
                    cnt=0;
                }
            }
        }
        System.out.println(sb);



    }
    static int dfs(int x,int y){
        cnt++;
        if(dp[x][y]==1&&visit[x][y]==false){
            visit[x][y]=true;
            for(int i=0; i<N; i++){
                if(visit[y][i]==false&&dp[y][i]==1){
                    visit[y][i]=true;
                    dfs(y,i);
                    visit[y][i]=false;
                }
            }
        }
        return cnt;



    }

}
