package DFSandBFS.연결요소의개수;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Retry {
    static int n;
    static int m;
    static boolean visit[];
    static ArrayList<Integer>dp[];
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        visit=new boolean[n+1];
        dp=new ArrayList[n+1];
        for(int i=0; i<=n; i++){
            dp[i]=new ArrayList<>();
        }

        for(int i=0; i<m; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            dp[a].add(b);
            dp[b].add(a);
        }

        int answer=0;
        for(int i=1; i<=n; i++){
            if(visit[i]==false){
                dfs(i);
                answer++;
            }
        }
        System.out.println(answer);
    }
    static public void dfs(int x){
        Queue<Integer>queue=new LinkedList<>();
        queue.add(x);
        visit[x]=true;

        while (!queue.isEmpty()) {
            int x1=queue.poll();
            for (int a : dp[x1]) {
                if (visit[a] == false) {
                    queue.add(a);
                    visit[a] = true;
                }
            }
        }
    }
}
