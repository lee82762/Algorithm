package 순열조합.중복순열알고리즘;

import java.util.Arrays;

public class Solution{
    //중복순열은 순열에서  visit하는것을 빼준다.
    public static void main(String[] args) {
        int []arr={1,2,3};
        int n=arr.length;
        int r=2;
        boolean visit[]=new boolean[n];
        int []output=new int[r];
        dfs(output,arr,0,n,r);
    }

    static void dfs(int []output, int []arr,int dept, int n, int r){

        if(dept==r){
            System.out.println(Arrays.toString(output));
            return;
        }
        else{
            for(int i=0; i<n; i++){
                output[dept]=arr[i];
                dfs(output,arr,dept+1,n,r);

            }
        }
    }

}
