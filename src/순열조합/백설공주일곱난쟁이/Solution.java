package 순열조합.백설공주일곱난쟁이;



import java.util.ArrayList;
import java.util.Collections;
//백준 2309번 문제 조합
public class Solution {
    //중복순열 순열에서  visit을 빼준다.
    static ArrayList<Integer>st=new ArrayList<>();

    public static void main(String[] args) {
        int []arr={20,7 ,23 ,19 ,10 ,15 ,25 ,8 ,13};
        int n=arr.length;
        int r=7;
        boolean visit[]=new boolean[n];
        int sum=100;
        dfs(arr,visit,0,n,r,sum);

        Collections.sort(st);

        for(int i=0; i<st.size(); i++){
            System.out.println(st.get(i));
        }

    }

    static void dfs(int []arr,boolean []visit,int start, int n, int r,int sum) {
        int result=0;

        if (r == 0) {
            result=0;
            for (int i = 0; i < arr.length; i++) {
                if (visit[i]) {
                    result+=arr[i];
                }
            }
            if(result==sum){
                for (int i = 0; i < arr.length; i++) {
                    if (visit[i]) {
                        st.add(arr[i]);
                    }
                }
            }
        }
        else {
            for (int i = start; i < arr.length; i++) {
                visit[i] = true;

                dfs(arr, visit, i + 1, n, r - 1, sum);

                visit[i] = false;
            }
        }

    }


}

