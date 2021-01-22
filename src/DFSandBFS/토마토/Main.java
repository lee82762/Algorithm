package DFSandBFS.토마토;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int [][]map;
    static boolean visit[][]=new boolean[1000][1000];
    static int []px={0,0,1,-1};
    static int []py={1,-1,0,0};
    static int count=0;
    static Queue<Integer>qx=new LinkedList<>();
    static Queue<Integer>qy=new LinkedList<>();
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();

        map=new int[1000][1000];

        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        int answer=0;
        int cnt=0;
        for(int i = 0; i < M; i++) {
            for(int j = 0; j < N; j++) {
                if(map[i][j]==1){
                    qx.add(i);
                    qy.add(j);
                }
                else if(map[i][j]==0){
                    cnt++;
                }
            }
        }
        if(cnt==0){
            System.out.println(answer);
        }
        else {
            bfs();

            int max = 0;

            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {

                    if (map[i][j] == 0) {
                        answer = -1;
                        break;
                    } else {
                        if (answer < map[i][j]) {
                            answer = map[i][j];
                        }
                    }
                }
                if (answer == -1) {
                    break;
                }
            }


            if (answer == -1) {
                System.out.println(answer);
            } else {
                System.out.println(answer - 1);
            }
        }

    }
    public static void bfs(){
        int x,y;
        while (!qx.isEmpty()&&!qy.isEmpty()){
            x=qx.poll();
            y=qy.poll();
            visit[x][y]=true;

            for(int i=0; i<4; i++){
                int x1=x+px[i];
                int y1=y+py[i];

                if(x1>=0&&y1>=0&&x1<M&&y1<N){
                    if(!visit[x1][y1]&&map[x1][y1]==0&&map[x1][y1]!=-1){
                        qx.add(x1);
                        qy.add(y1);
                        visit[x1][y1]=true;
                        map[x1][y1]=map[x][y]+1;
                    }
                }
            }

        }


    }
}