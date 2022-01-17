package 비트마스크.외판원순회;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    static int dist[][];
    static int dp[][];
    static int max=100000000;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        dist=new int[n][n];
        dp=new int[n][(1<<n)];

        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],max);
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                dist[i][j]=sc.nextInt();
            }
        }

        System.out.println(dfs(0,1));

    }
    static public int dfs(int node, int num){
        if(num == (1<<n)-1){
            if(dist[node][0]==0){
                return max;
            }
            return dist[node][0];
        }

        if(dp[node][num] != max){
            return dp[node][num];
        }

        for(int i=0; i<n; i++){
            int next =num | (1<<i);
            if(dist[node][i]==0 || (num & (1<<i))!=0){
                continue;
            }
            dp[node][num] = Math.min(dp[node][num], dfs(i,next)+dist[node][i]);
        }

        return dp[node][num];
    }
}