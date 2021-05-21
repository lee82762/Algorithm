package DFSandBFS.상근이의여행;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int T;
    static int N;
    static int M;
    static int map[][];
    static boolean visit[];
    static int answer=0;

    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();
        for(int k=0; k<T; k++) {
            N = sc.nextInt();
            M = sc.nextInt();
            map = new int[N + 1][N + 1];
            visit = new boolean[N + 1];

            for (int i = 0; i < M; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                map[a][b] = 1;
                map[b][a] = 1;
            }
            bfs(1);
            System.out.println(answer);
            answer=0;
        }

    }
    static void bfs(int x){
        Queue<Integer>queue=new LinkedList<>();
        queue.add(x);
        visit[x]=true;

        while (!queue.isEmpty()){
            int x1=queue.poll();

            for(int i=1; i<=N; i++){
                if(visit[i]==false&&map[x1][i]==1){
                    answer++;
                    queue.add(i);
                    visit[i]=true;
                }
            }
        }

    }
}

