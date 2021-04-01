package DFSandBFS.네트워크;

class Retry {
    public int solution(int n, int[][] computer) {

        int answer=0;
        boolean visit[]=new boolean[n];
        for(int i=0; i<n; i++){
            if(visit[i]==false){
                dfs(i,computer,visit);
                answer++;
            }
        }
        return answer;

    }
    public static void dfs(int start,int [][]computer, boolean []visit){

        for(int i=0; i<computer.length; i++){
            if(visit[i]==false&&computer[start][i]==1){
                visit[start]=true;
                dfs(i,computer,visit);

            }
        }
    }
}
