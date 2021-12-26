package DFSandBFS.피로도;

class Retry {
    static int arr[];
    static int output[];
    static boolean visit[];
    static int answer=0;
    public int solution(int k, int[][] dungeons) {
        int r=dungeons.length;
        arr=new int[r];
        output=new int[r];
        visit=new boolean[r];
        for(int i=0; i<r; i++){
            arr[i]=i;
        }
        dfs(r,0,k,dungeons);

        return answer;
    }
    static public void dfs(int r,int dept,int k, int dungeons[][]){
        if(dept==r){
            check(output,k,dungeons);
            return;
        }
        for(int i=0; i<arr.length; i++){
            if(visit[i]==false){
                output[dept]=arr[i];
                visit[i]=true;
                dfs(r,dept+1,k,dungeons);
                visit[i]=false;
            }
        }

    }
    static public void check(int []output,int k, int dungeons[][]){
        int cnt=0;
        for(int i=0; i<output.length; i++){
            int a=output[i];
            if(k>=dungeons[a][0]){
                k-=dungeons[a][1];
                cnt++;
            }
            else{
                break;
            }
        }
        answer=Math.max(answer,cnt);
    }
}
