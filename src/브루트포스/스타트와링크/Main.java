package 브루트포스.스타트와링크;

import java.util.Scanner;

public class Main {
    static int N;
    static int [][]map;
    static boolean visit[];
    static int min=10000000;

    public static void main(String argp[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        visit=new boolean[100001];
        map = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        dfs(0,0);
        System.out.println(min);


    }
    static public void dfs(int start,int r){
        if(r==N/2){
            change();
            return;
        }

        for(int i=start; i<N; i++ ){
            if(visit[i]==false) {
                visit[i] = true;
                dfs(i + 1, r + 1);
                visit[i] = false;
            }
        }


    }
    static public void change(){
        int start=0;
        int ring=0;

        for(int i=0; i<N-1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (visit[i] == true && visit[j] == true) {
                    start += map[i][j];
                    start += map[j][i];
                } else if (visit[i] == false && visit[j] == false) {
                    ring += map[i][j];
                    ring += map[j][i];
                }
            }
        }
        int result=Math.abs(start-ring);

        min=Math.min(min,result);
    }



}
