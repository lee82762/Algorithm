package DFSandBFS.OilDepsites;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static String [][]map;
    static boolean [][]visit;
    static int dx[]={1,-1,0,0,1,1,-1,-1};
    static int dy[]={0,0,1,-1,1,-1,1,-1};
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            N = sc.nextInt();
            M = sc.nextInt();
            if(N==0&&M==0){
                break;
            }
            map = new String[N][M];
            visit = new boolean[N][M];

            for (int i = 0; i < N; i++) {
                String s = sc.next();
                for (int j = 0; j < M; j++) {
                    map[i][j] = String.valueOf(s.charAt(j));
                }
            }

            int answer = 0;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (visit[i][j] == false && map[i][j].equals("@")) {
                        bfs(i, j);
                        answer++;
                    }
                }
            }
            System.out.println(answer);
        }



    }

    static void bfs(int x, int y) {
        Queue<Integer>qx=new LinkedList<>();
        Queue<Integer>qy=new LinkedList<>();
        qx.add(x);
        qy.add(y);
        visit[x][y]=true;

        while (!qx.isEmpty()&&!qy.isEmpty()){
            int x1=qx.poll();
            int y1=qy.poll();
            for(int i=0; i<8; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];
                if(x2>=0&&x2<N&&y2>=0&&y2<M){
                    if(visit[x2][y2]==false&&map[x2][y2].equals("@")){
                        qx.add(x2);
                        qy.add(y2);
                        visit[x2][y2]=true;
                    }
                }
            }
        }

    }
}
