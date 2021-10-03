package DFSandBFS.농장관리;

import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int map[][];
    static int dx[]={1,-1,0,0,1,1,-1,-1};
    static int dy[]={0,0,1,-1,1,-1,1,-1};
    static boolean visit[][];
    static class Pair{
        int x;
        int y;
        public Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    static boolean flag=true;
    public static void main(String argp[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        map=new int[N][M];
        visit=new boolean[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                map[i][j]=sc.nextInt();
            }
        }
        int answer=0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(visit[i][j]==false){
                    flag=true;
                    dfs(i,j);
                    if(flag==true) {
                        answer++;
                    }
                }
            }
        }
        System.out.println(answer);



    }
    public static void dfs(int x, int y){
        for(int i=0; i<8; i++){
            int x2=x+dx[i];
            int y2=y+dy[i];

            if(x2<0||x2>=N||y2<0||y2>=M) continue;
            if(map[x][y]<map[x2][y2]) flag=false;
            if(visit[x2][y2]==true||map[x2][y2]!=map[x][y]) continue;
            visit[x2][y2]=true;
            dfs(x2,y2);
        }
    }
}
