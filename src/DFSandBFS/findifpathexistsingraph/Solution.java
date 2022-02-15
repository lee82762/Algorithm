package DFSandBFS.findifpathexistsingraph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    static boolean visit[];
    static ArrayList<Integer> dp[];
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(n==1){
            return true;
        }
        visit=new boolean[n];
        dp=new ArrayList[n];
        for(int i=0; i<n; i++){
            dp[i]=new ArrayList<>();
        }

        for(int i=0; i<edges.length; i++){
            int a=edges[i][0];
            int b=edges[i][1];
            dp[a].add(b);
            dp[b].add(a);
        }
        return dfs(n,source,destination);

    }
    static public boolean dfs(int n,int start,int des){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(start);
        visit[start]=true;

        while (!queue.isEmpty()){
            int tm=queue.poll();
            for(int a : dp[tm]){
                if(a==des){
                    return true;
                }
                if(visit[a]==false){
                    queue.add(a);
                    visit[a]=true;
                }
            }
        }

        return false;

    }
}
