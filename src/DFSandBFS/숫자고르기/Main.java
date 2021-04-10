package DFSandBFS.숫자고르기;

import java.util.ArrayList;
import java.util.Scanner;
//dfs 생각잘하기
public class Main {
    static int N;
    static int result;
    static int dp[];
    static boolean visit[];
    static ArrayList<Integer>a1=new ArrayList<>();
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        dp=new int[N+1];
        visit=new boolean[N+1];
        for(int i=1; i<=N; i++){
            int a=sc.nextInt();
            dp[i]=a;
        }

        for(int i=1; i<=N; i++){
            visit[i]=true;
            result=i;
            dfs(i);

            visit[i]=false;
        }
        System.out.println(a1.size());
        for(int i=0; i<a1.size(); i++){
            System.out.println(a1.get(i));
        }

    }
    static void dfs(int x){
        if(!visit[dp[x]]){
            visit[dp[x]]=true;
            dfs(dp[x]);
            visit[dp[x]]=false;
        }
        if(result==dp[x]){
            a1.add(dp[x]);
        }

    }


}