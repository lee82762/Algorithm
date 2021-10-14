package 비트마스킹.도영이가만든맛있는음식;

import java.util.Scanner;
//비트마스킹 확인하기
public class Main {
    static int SB[][];
    static int N;
    static boolean visit[];
    static int answer=Integer.MAX_VALUE;
    public static void main(String argp[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        SB=new int[N][2];

        visit=new boolean[N];
        for(int i=0; i<N; i++){
            int s1=sc.nextInt();
            int b1=sc.nextInt();
            SB[i][0]=s1;
            SB[i][1]=b1;
        }
        dfs(0);
        System.out.println(answer);
    }
    public static void dfs(int len){
        if(len==N){
            int s=1;
            int b=0;
            int cnt=0;

            for(int i=0; i<N; i++){
                if(visit[i]==false){
                    cnt++;
                    s*=SB[i][0];
                    b+=SB[i][1];
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
        dfs(len+1);
        visit[len]=false;
        dfs(len+1);

    }

}
