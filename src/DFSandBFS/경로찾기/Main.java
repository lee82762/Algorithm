package DFSandBFS.경로찾기;

//dfs로 해결
import java.util.Scanner;

public class Main {
    static  int N;
    static  int [][]dp;
    static  int [][]map;
    static boolean []visit;
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();

        map=new int[N][N];
        dp=new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                map[i][j]=sc.nextInt();
            }
        }

        visit=new boolean[N];
        for(int i=0; i<N; i++){
            dfs(map,i);
            for(int j=0; j<N; j++) {
                if(visit[j]==true){
                    dp[i][j]=1;
                }
            }
            visit=new boolean[N];
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }

    }
    static void dfs(int [][]map,int i){
        for(int j=0; j<map.length; j++){
            if(map[i][j]==1&&visit[j]!=true){
                visit[j]=true;
                dfs(map,j);
            }

        }

    }

}
