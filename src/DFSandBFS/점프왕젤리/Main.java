package DFSandBFS.점프왕젤리;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//텔레포트 정거장
public class Main {
    static int N;
    static boolean visit[][];
    static int map[][];
    static int dx[]={1,0};
    static int dy[]={0,1};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        visit=new boolean[N][N];
        map=new int[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                map[i][j]=sc.nextInt();
            }
        }
        bfs(0,0);


        if(visit[N-1][N-1]==true){
            System.out.println("HaruHaru");
        }
        else{
            System.out.println("Hing");
        }




    }
    static public void bfs(int x, int y){
        Queue<Integer>qx=new LinkedList<>();
        Queue<Integer>qy=new LinkedList<>();
        qx.add(x);
        qy.add(y);
        visit[x][y]=true;
        while (!qx.isEmpty()&&!qy.isEmpty()){
            int x1=qx.poll();
            int y1=qy.poll();

            for(int i=0; i<2; i++){
                int x2=x1+(dx[i]*map[x1][y1]);
                int y2=y1+(dy[i]*map[x1][y1]);

                if(x2>=0&&x2<N&&y2>=0&&y2<N){
                    if(visit[x2][y2]==false){
                        qx.add(x2);
                        qy.add(y2);
                        visit[x2][y2]=true;
                    }
                }
            }
        }

    }
}