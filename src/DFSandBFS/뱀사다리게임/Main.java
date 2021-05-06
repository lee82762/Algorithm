package DFSandBFS.뱀사다리게임;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int answer=0;
    static int N;
    static int M;
    static int dp[];
    static int count[];
    static boolean visit[];
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();

        dp=new int[101];
        count=new int[101];
        visit=new boolean[101];

        for(int i=0; i<N+M; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            dp[a]=b;
        }

        bfs();
        System.out.println(answer);






    }
    static void bfs(){
        Queue<Integer>queue=new LinkedList<>();
        queue.add(1);
        visit[1]=true;

        while (!queue.isEmpty()){
            int cur=queue.poll();
            int count1=count[cur];

            if(cur==100){
                answer=count1;
            }

            int rox1=0;
            for(int i=1; i<=6; i++){
                rox1=i+cur;
                if(rox1>100){
                    continue;
                }
                if(visit[rox1]){
                    continue;
                }
                visit[rox1]=true;
                if(dp[rox1]==0){
                    count[rox1]=count1+1;
                    queue.add(rox1);
                }
                else{
                    if(!visit[dp[rox1]]) {
                        count[dp[rox1]] = count1 + 1;
                        visit[dp[rox1]] = true;
                        queue.add(dp[rox1]);
                    }

                }


            }

        }


    }
}
