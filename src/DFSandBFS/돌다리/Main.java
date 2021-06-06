package DFSandBFS.돌다리;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int A;
    static int B;
    static int N;
    static int M;
    static boolean visit[];
    static int dx[];
    static int arr[];
    static class Pair{
        int x;
        int cnt;
        public Pair(int x,int cnt){
            this.x=x;
            this.cnt=cnt;

        }
    }
    static int answer=0;
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        A=sc.nextInt();
        B=sc.nextInt();
        N=sc.nextInt();
        M=sc.nextInt();

        arr=new int[100001];
        visit=new boolean[100001];

        dx= new int[]{1, -1, A, -A, B, -B,A,B};

        bfs(N);
        System.out.println(answer);

    }
    static void bfs(int x){
        Queue<Pair>queue=new LinkedList<>();
        visit[x]=true;
        queue.add(new Pair(x,0));
        while (!queue.isEmpty()) {
            Pair p1=queue.poll();
            int x1=p1.x;
            int cnt=p1.cnt;

            if(x1==M){
                answer=cnt;
                break;
            }

            for(int i=0; i<8; i++) {
                int x2 = 0;
                if (i >= 6) {
                    x2 = x1 * dx[i];
                } else {
                    x2 = x1 + dx[i];
                }
                if(x2>=0&&x2<100001) {

                    if (visit[x2] == false) {
                        visit[x2] = true;
                        queue.add(new Pair(x2, cnt + 1));

                    }
                }
            }


        }


    }
}