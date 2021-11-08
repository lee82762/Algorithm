package 브루트포스.도영이가만든맛있는음식;

import java.util.Scanner;

public class Main {

    static int [][]sb;
    static boolean visit[];
    static int answer=Integer.MAX_VALUE;
    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sb=new int[n][2];
        visit=new boolean[n];
        for(int i=0; i<n; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            sb[i][0]=a;
            sb[i][1]=b;
        }
        dfs(0,n);
        System.out.println(answer);
    }

    public static void dfs(int len,int n){
        if(len==n){
            int s=1;
            int b=0;
            int cnt=0;
            for(int i=0; i<n; i++){
                if(visit[i]==false){
                    cnt++;
                    s*=sb[i][0];
                    b+=sb[i][1];
                }
            }

            if(cnt==0){
                return;
            }
            if(answer>Math.abs(s-b)){
                answer=Math.abs(s-b);
            }
            return;
        }

        visit[len]=true;
        dfs(len+1,n);
        visit[len]=false;
        dfs(len+1,n);
    }
}
