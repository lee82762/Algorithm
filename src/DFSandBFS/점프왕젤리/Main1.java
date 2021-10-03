package DFSandBFS.점프왕젤리;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main1 {
    static int N;
    static int map[][];
    static int dx[]={1,0};
    static int dy[]={0,1};
    static boolean visit[][];
    static class Pair{
        int x;
        int y;
        public Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    static boolean answer=false;
    public static void main(String argp[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        map=new int[N][N];
        visit=new boolean[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                map[i][j]=sc.nextInt();
            }
        }
        bfs(0,0);
        if(answer==true){
            System.out.println("HaruHaru");
        }
        else{
            System.out.println("Hing");
        }



    }
    public static void bfs(int x, int y){
        Queue<Pair>queue=new LinkedList<>();
        queue.add(new Pair(x,y));
        visit[x][y]=true;

        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x1=p1.x;
            int y1=p1.y;
            if(x1==N-1&&y1==N-1){
                answer=true;
                break;
            }

            for(int i=0; i<2; i++){
                int x2=x1+(dx[i]*map[x1][y1]);
                int y2=y1+(dy[i]*map[x1][y1]);

                if(x2>=0&&x2<N&&y2>=0&&y2<N){
                    if(visit[x2][y2]==false){
                        queue.add(new Pair(x2,y2));
                        visit[x2][y2]=true;
                    }
                }
            }
        }
    }
}

