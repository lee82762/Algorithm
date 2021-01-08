package 순열조합.줄서는방법;

//모든 순열을 구하고 k번째에 맞는 배열을 뽑아오는 방식
//정확성 100 / 효율성 0
//모든 순열을 구하는데 시간이 너무오래 걸린다.

import java.util.ArrayList;
class Solution {
    static long cnt=0;
    static ArrayList<Integer>a1=new ArrayList<>();
    public int[] solution(int n, long k) {

        int ans[]=new int[n];
        for(int i=0; i<n; i++){
            ans[i]=i+1;
        }
        int output[]=new int[n];
        boolean visit[]=new boolean[ans.length];

        dfs(ans,output,visit,0,ans.length,n,k);

        int answer[]=new int[a1.size()];
        for(int i=0; i<a1.size(); i++){
            answer[i]=a1.get(i);
        }

        return answer;

    }
    public static void dfs(int []ans,int []output, boolean visit[], int dept, int n, int r,long k){

        if(dept==r){
            cnt++;
            if(cnt==k){
                for(int i=0; i<output.length; i++){
                    a1.add(output[i]);
                }
            }

        }
        for(int i=0; i<n; i++){
            if(!visit[i]){
                output[dept]=ans[i];
                visit[i]=true;
                dfs(ans,output,visit,dept+1,n,r,k);
                visit[i]=false;
            }
        }
    }


}
