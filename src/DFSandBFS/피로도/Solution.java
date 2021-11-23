package DFSandBFS.피로도;

class Solution {
    static int answer=0;

    public int solution(int k, int[][] dungeons) {

        boolean visit[]=new boolean[dungeons.length];
        int re[]=new int[dungeons.length];
        for(int i=0; i<re.length; i++){
            re[i]=i;
        }

        int output[]=new int[dungeons.length];
        dfs(re,output,0,visit,dungeons,k);

        return answer;
    }
    static public void dfs(int []re,int []output, int dept, boolean visit[],int [][]dungeons,int k){
        if(dept==re.length){
            int k1=k;
            int ans=0;
            for(int i=0; i<output.length; i++){
                int a=output[i];
                if(dungeons[a][0]<=k1){
                    k1-=dungeons[a][1];
                    ans++;
                }
            }
            answer=Math.max(answer,ans);
            return;
        }
        for(int i=0; i<re.length; i++){
            if(visit[i]==false){
                output[dept]=re[i];
                visit[i]=true;
                dfs(re,output,dept+1,visit,dungeons,k);
                visit[i]=false;
            }
        }

    }
}
