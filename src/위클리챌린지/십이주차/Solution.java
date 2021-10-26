package 위클리챌린지.십이주차;

class Solution {
    static int answer=0;
    static int []output;
    static int []arr;
    static boolean []visit;
    public int solution(int k, int[][] dungeons) {

        int r=dungeons.length;
        output=new int[r];
        arr=new int[r];
        for(int i=0; i<r; i++){
            arr[i]=i+1;
        }

        visit=new boolean[r];
        dfs(r,dungeons,k,0);


        return answer;
    }
    public static void dfs(int r,int [][]dungeons, int k,int dept){
        if(dept==r){
            int result=0;
            for(int i=0; i<output.length; i++){
                int a=output[i];
                if(k<dungeons[a-1][0]){
                    break;
                }
                k=k-dungeons[a-1][1];
                result++;
            }
            answer=Math.max(answer,result);

            return;
        }
        for(int i=0; i<r; i++){
            if(visit[i]==false){
                output[dept]=arr[i];
                visit[i]=true;
                dfs(r,dungeons,k,dept+1);
                visit[i]=false;
            }
        }



    }
}
