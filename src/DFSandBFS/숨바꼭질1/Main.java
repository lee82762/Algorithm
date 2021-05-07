package DFSandBFS.숨바꼭질1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int answer=0;
    static int N;
    static int K;
    static int dp[];
    static int dx[]={1,-1,2};
    static boolean visit[];
    static class Pair{
        int dis;
        int cnt;
        public Pair(int dis, int cnt){
            this.dis=dis;
            this.cnt=cnt;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        K=sc.nextInt();
        dp=new int[100001];
        visit=new boolean[100001];
        bfs(N);
        System.out.println(answer);


    }
    static void bfs(int x){
        Queue<Pair>queue=new LinkedList<>();
        queue.add(new Pair(x,0));
        visit[x]=true;
        while (!queue.isEmpty()){
            Pair p1=queue.poll();

            int x1=p1.dis;
            int cnt1=p1.cnt;
            if(x1==K){
                answer=cnt1;
                break;
            }



            for(int i=0; i<3; i++){
                int x2=0;
                if(i==2){
                    x2=dx[i]*x1;
                }
                else{
                    x2=x1+dx[i];
                }


                if(x2>=0&&x2<100001) {
                    if (visit[x2] == false) {
                        queue.add(new Pair(x2, cnt1 + 1));
                        visit[x2] = true;
                    }
                }

            }
        }
    }
}
