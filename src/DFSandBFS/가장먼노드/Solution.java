package DFSandBFS.가장먼노드;

import java.util.LinkedList;
import java.util.Queue;


class Solution {
    static int dp[];
    public int solution(int n, int[][] edge) {

        boolean map[][]=new boolean[n][n];

        for(int i=0; i<edge.length; i++){
            int a=edge[i][0]-1;
            int b=edge[i][1]-1;
            map[a][b]=true;
            map[b][a]=true;

        }


        dp=new int[n+1];

        bfs(0,n,map,dp);


        int max=0;
        int cnt=0;

        for(int i=0; i<n; i++){
            max=Math.max(max,dp[i]);
        }

        for(int i=0; i<n; i++){
            if(max==dp[i]){
                cnt++;

            }
        }
        return cnt;
    }
    public static void bfs(int x,int n,boolean map[][],int dp[]){
        Queue<Integer>queue=new LinkedList<>();
        queue.add(x);




        while (!queue.isEmpty()){
            int x1=queue.poll();



            for(int i=1; i<n; i++){
                if(dp[i]==0&&map[x1][i]){

                    queue.add(i);
                    dp[i]=dp[x1]+1;

                }
            }

        }





    }
}
