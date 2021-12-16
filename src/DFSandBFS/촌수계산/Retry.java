package DFSandBFS.촌수계산;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Retry {
    static int n;
    static int k;
    static int pk;
    static int m;
    static ArrayList<Integer>dp[];
    static int answer=0;
    static int dp1[];
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        pk=sc.nextInt();
        m=sc.nextInt();
        dp=new ArrayList[n+1];
        dp1=new int[n+1];
        for(int i=0; i<=n; i++){
            dp[i]=new ArrayList<>();
        }

        for(int i=0; i<m; i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            dp[x].add(y);
            dp[y].add(x);
        }
        dfs(k,pk,0);
        if(dp1[pk]==0){
            System.out.println("-1");
        }
        else {
            System.out.println(dp1[pk]);
        }

    }
    static public void dfs(int x,int pk, int cnt){
        Queue<Integer>queue=new LinkedList<>();
        queue.add(x);

        while (!queue.isEmpty()){
            int a=queue.poll();
            if(a==pk){
                return;
            }

            for(int b : dp[a]){
                if(dp1[b]==0){
                    queue.add(b);
                    dp1[b]=dp1[a]+1;
                }
            }
        }


    }
}
