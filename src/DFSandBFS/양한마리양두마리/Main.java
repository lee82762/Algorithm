package DFSandBFS.양한마리양두마리;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int T;
    static int H;
    static int W;
    static String arr[][];
    static boolean visit[][];
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();
        for(int k=0; k<T; k++) {
            H = sc.nextInt();
            W = sc.nextInt();

            arr = new String[H][W];
            visit = new boolean[H][W];

            for (int i = 0; i < H; i++) {
                String s = sc.next();
                for (int j = 0; j < W; j++) {
                    arr[i][j] = String.valueOf(s.charAt(j));
                }
            }


            int answer = 0;
            for (int i = 0; i < H; i++) {
                for (int j = 0; j < W; j++) {
                    if (arr[i][j].equals("#") && visit[i][j] == false) {
                        bfs(i, j);
                        answer++;
                    }
                }

            }
            System.out.println(answer);
        }


    }
    static void bfs(int x,int y){
        Queue<Integer>qx=new LinkedList<>();
        Queue<Integer>qy=new LinkedList<>();

        qx.add(x);
        qy.add(y);
        visit[x][y]=true;

        while (!qx.isEmpty()&&!qy.isEmpty()){
            int x1=qx.poll();
            int y1=qy.poll();

            for(int i=0; i<4; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];

                if(x2>=0&&x2<H&&y2>=0&&y2<W){
                    if(visit[x2][y2]==false&&arr[x2][y2].equals("#")){
                        qx.add(x2);
                        qy.add(y2);
                        visit[x2][y2]=true;
                    }
                }
            }
        }


    }
}