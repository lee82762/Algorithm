package DFSandBFS.미로탐색;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Last {
    static int N;
    static int M;
    static int map[][];
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static boolean visit[][];
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        map=new int[N][M];
        visit=new boolean[N][M];
        for(int i=0; i<N; i++){
            String s=sc.next();
            for(int j=0; j<M; j++){
                map[i][j]=Integer.parseInt(String.valueOf(s.charAt(j)));
            }
        }
        bfs(0,0);
        System.out.println(map[N-1][M-1]);
    }
    static public void bfs(int x, int y){
        Queue<Integer> qx =new LinkedList<>();
        Queue<Integer> qy= new LinkedList<>();
        qx.add(x);
        qy.add(y);
        visit[x][y]=true;

        while (!qx.isEmpty() && !qy.isEmpty()){
            int x1=qx.poll();
            int y1=qy.poll();

            for(int i=0; i<4; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];

                if(x2 >=0 && x2<N && y2>=0 && y2<M){
                    if(visit[x2][y2]==false && map[x2][y2]==1){
                        qx.add(x2);
                        qy.add(y2);
                        map[x2][y2]=map[x1][y1]+1;

                    }
                }
            }
        }

    }
}
