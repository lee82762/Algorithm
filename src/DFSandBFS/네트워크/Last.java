package DFSandBFS.네트워크;

class Last {
    public int solution(int n, int[][] computers) {
        int map[][]=new int[n+1][n+1];

        for(int i=0; i<computers.length; i++){
            for(int j=0; j<computers.length; j++){
                if(i==j) continue;
                if(computers[i][j]==1){
                    int a=i+1;
                    int b=j+1;
                    map[a][b]=1;
                }
            }
        }
        boolean visit[]=new boolean[n+1];
        int answer=0;
        for(int i=1; i<=n; i++){
            if(visit[i]==false){
                dfs(i,map,visit,n);
                answer++;
            }
        }
        return answer;

    }
    static public void dfs(int x,int [][]map, boolean []visit,int n){
        for(int i=1; i<=n; i++){
            if(map[x][i]==1 && visit[i] ==false){
                visit[i]=true;
                dfs(i,map,visit,n);
            }
        }

    }
}
