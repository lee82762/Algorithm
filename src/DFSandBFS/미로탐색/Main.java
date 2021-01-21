package DFSandBFS.미로탐색;



import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int [][]map;
    static boolean visit[][]=new boolean[100][100];
    static int []px={0,0,1,-1};
    static int []py={1,-1,0,0};
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        map=new int[N+2][M+2];

        for(int i=0;i<N;i++) {
            String row = sc.next();
            for (int j = 0; j < M; j++) {
                map[i][j] = row.charAt(j) - '0';
            }
        }

        bfs(0,0);


        System.out.println(map[N-1][M-1]);

    }
    public static void bfs(int x,int y){
        Queue<Integer>qx=new LinkedList<>();
        Queue<Integer>qy=new LinkedList<>();

        qx.add(x);
        qy.add(y);

        while (!qx.isEmpty()&&!qy.isEmpty()){
            x=qx.poll();
            y=qy.poll();

            visit[x][y]=true;
            for(int i=0; i<4; i++){
                int x1=x+px[i];
                int y1=y+py[i];

                if(x1>=0&&y1>=0&&x1<N&&y1<M){
                    if(!visit[x1][y1]&&map[x1][y1]!=0){
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




