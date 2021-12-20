package DFSandBFS.헌내기는새내기가필요해;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Retry {
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static boolean visit[][];
    static String map[][];
    static int N;
    static int M;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        map=new String[N][M];
        visit=new boolean[N][M];

        for(int i=0; i<N; i++){
            String s=sc.next();
            for(int j=0; j<M; j++){
                map[i][j]=String.valueOf(s.charAt(j));
            }
        }
        int answer=0;
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(visit[i][j]==false && map[i][j].equals("I")){
                    answer=bfs(i,j);
                }
            }
        }
        if(answer==0){
            System.out.println("TT");
        }
        else{
            System.out.println(answer);
        }




    }
    static public int bfs(int x , int y){
        int cnt=0;
        Queue<Integer>qx=new LinkedList<>();
        Queue<Integer>qy=new LinkedList<>();
        qx.add(x);
        qy.add(y);
        visit[x][y]=true;

        while (!qx.isEmpty() && !qy.isEmpty()){
            int x1=qx.poll();
            int y1=qy.poll();

            for(int i=0; i<4; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];

                if(x2>=0 && x2<N && y2>=0 && y2<M){
                    if(visit[x2][y2]==false && map[x2][y2].equals("O")){
                        qx.add(x2);
                        qy.add(y2);
                        visit[x2][y2]=true;
                    }
                    else if(visit[x2][y2]==false && map[x2][y2].equals("P")){
                        cnt++;
                        qx.add(x2);
                        qy.add(y2);
                        visit[x2][y2]=true;
                    }
                }
            }
        }
        return cnt;

    }
}
