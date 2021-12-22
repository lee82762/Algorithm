package DFSandBFS.모두0으로만들기;

import java.util.*;
class Solution {
    private List<Integer>dp[];
    long a2[];
    long answer=0;
    public long solution(int[] a, int[][] edges) {
        a2=new long[a.length];
        long sum=0;
        for(int i=0; i<a.length; i++){
            sum+=a[i];
            a2[i]=a[i];
        }
        if(sum!=0){
            return -1;
        }
        dp=new ArrayList[a.length];
        for(int i=0; i<a.length; i++){
            dp[i]=new ArrayList<>();
        }
        for(int i=0; i< edges.length; i++){
            int x=edges[i][0];
            int y=edges[i][1];
            dp[x].add(y);
            dp[y].add(x);

        }

        dfs(0,0);
        return answer;
    }
    //함수
    public void dfs(int x,int par){
        for(int a1 : dp[x]){
            if(a1!=par) {
                dfs(a1,x);
            }
        }
        a2[par]+=a2[x];
        answer+=Math.abs(a2[x]);
    }
}
