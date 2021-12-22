package DFSandBFS.가장먼노드;

import java.util.LinkedList;
import java.util.*;
class Last {
    static int d[];
    static ArrayList<Integer>dp[];
    static boolean visit[];
    static int max=0;
    public int solution(int n, int[][] vertex) {
        d=new int[n+1];
        visit=new boolean[n+1];
        dp=new ArrayList[n+1];
        for(int i=0; i<n+1; i++){
            dp[i]=new ArrayList<>();
        }

        for(int i=0; i<vertex.length; i++){
            int a=vertex[i][0];
            int b=vertex[i][1];
            dp[a].add(b);
            dp[b].add(a);
        }
        bfs(1);

        int answer=0;
        for(int i=1; i<d.length; i++){
            if(max==d[i]){
                answer++;
            }
        }
        return answer;

    }
    static public void bfs(int x){
        Queue<Integer>queue=new LinkedList<>();
        queue.add(x);
        visit[x]=true;
        while (!queue.isEmpty()) {
            int tm=queue.poll();
            for (int a : dp[tm]) {
                if (visit[a] == false) {
                    queue.add(a);
                    visit[a] = true;
                    d[a] = d[tm] + 1;
                    max=Math.max(max,d[a]);
                }
            }
        }

    }

}
