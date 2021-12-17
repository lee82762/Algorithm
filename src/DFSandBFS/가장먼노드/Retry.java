package DFSandBFS.가장먼노드;

import java.util.LinkedList;
import java.util.*;
class Retry {
    static ArrayList<Integer>dp[];
    static int d[];
    static boolean visit[];
    public int solution(int n, int[][] vertex) {
        d=new int[n+1];
        visit=new boolean[n+1];
        dp=new ArrayList[n+1];
        for(int i=0; i<=n; i++){
            dp[i]=new ArrayList<>();
        }
        for(int i=0; i<vertex.length; i++){
            int a=vertex[i][0];
            int b=vertex[i][1];
            dp[a].add(b);
            dp[b].add(a);
        }
        bfs(1);
        int max=0;
        for(int a: d){
            max=Math.max(max,a);
        }
        int answer=0;
        for(int i=1; i<=n; i++){
            if(max==d[i]){
                answer++;
            }
        }
        return answer;

    }
    static public void bfs(int x){
        Queue<Integer> queue = new LinkedList<>();
        queue.add(x);
        visit[x]=true;

        while (!queue.isEmpty()){
            int a=queue.poll();
            for(int a1 : dp[a]){
                if(visit[a1]==false){
                    queue.add(a1);
                    visit[a1]=true;
                    d[a1]=d[a]+1;
                }
            }
        }

    }

}