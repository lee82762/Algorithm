package DFSandBFS.네트워크;

class Solution {
    public int solution(int n, int[][] computers) {

        boolean visit[] = new boolean[computers[0].length];
        int answer = 0;
        for(int i=0; i<n; i++){
            if(visit[i]!=true){
                answer++;
                dfs(computers,visit,i);
            }
        }
        return answer;
    }

    public static void dfs(int [][]computers,boolean []visit, int i){
        for(int j=0; j<computers[i].length; j++){
            if(computers[i][j]==1&&visit[j]!=true){
                visit[i]=true;
                dfs(computers,visit,j);
            }
        }
    }
}
