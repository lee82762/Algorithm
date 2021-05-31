package DFSandBFS.한동이는공부가싫어;

import java.util.Scanner;

public class Main {
    static int N;
    static int arr[][];
    static boolean visit[];
    static int answer=0;

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        arr=new int[N+1][N+1];
        visit=new boolean[N+1];

        for(int i=1; i<=N; i++){
            int a=sc.nextInt();
            arr[i][a]=1;
        }
        int max=0;
        int index=0;
        for(int i=1; i<=N; i++){
            visit=new boolean[N+1];
            dfs(i);
            if(answer>max){
                max=answer;
                index=i;
            }
            answer=0;
        }
        System.out.println(index);




    }
    static void dfs(int x){
        visit[x]=true;

        for (int i=1; i<=N; i++){
            if(arr[x][i]==1&&visit[i]==false){
                visit[i]=true;
                answer++;
                dfs(i);

            }

        }
    }


}
