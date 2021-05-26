package DFSandBFS.쿼트압축후개수세기;

class Solution {
    static int one;
    static int zero;
    public int[] solution(int[][] arr) {


        int len=arr.length;
        dfs(arr,0,0,len);
        int answer[]=new int[2];
        answer[0]=zero;
        answer[1]=one;
        return answer;
    }

    static void dfs(int arr[][],int a, int b,int len){
        if(len==1){
            if(arr[a][b]==1){
                one++;
            }
            else{
                zero++;
            }
            return;
        }


        boolean flag=true;
        int v=arr[a][b];
        for(int i=a; i<a+len; i++){
            if(flag) {
                for (int j = b; j < b + len; j++) {
                    if (v != arr[i][j]) {
                        flag = false;
                        break;
                    }
                }
            }
            else{
                break;
            }

        }


        if(flag){
            if(v==1){
                one++;
            }
            else{
                zero++;
            }
        }
        else{
            len=len/2;

            dfs(arr,a,b,len);
            dfs(arr,a+len,b,len);
            dfs(arr,a,b+len,len);
            dfs(arr,a+len,b+len,len);
        }



    }
}
