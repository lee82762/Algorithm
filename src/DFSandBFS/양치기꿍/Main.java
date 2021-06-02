package DFSandBFS.양치기꿍;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static String arr[][];
    static boolean visit[][];
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static int K;
    static int V;
    //static int cnt=0;

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();

        arr=new String[N][M];
        visit=new boolean[N][M];
        int []answer=new int[2];

        for(int i=0; i<N; i++){
            String s=sc.next();
            for(int j=0; j<M; j++){
                arr[i][j]=String.valueOf(s.charAt(j));
            }
        }


        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(visit[i][j]==false&&!arr[i][j].equals("#")){
                    bfs(i,j);
                    if(K>V){
                        V=0;
                    }
                    else if(V>=K){
                        K=0;
                    }
                    answer[0]+=K;
                    answer[1]+=V;
                    V=0;
                    K=0;

                }
            }
        }
        System.out.println(answer[0]+" "+answer[1]);

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
            if(arr[x1][y1].equals("v")){
                V++;
            }
            else if(arr[x1][y1].equals("k")){
                K++;
            }

            for(int i=0; i<4; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];

                if(x2>=0&&x2<N&&y2>=0&&y2<M){
                    if(visit[x2][y2]==false&& !arr[x2][y2].equals("#")){
                        qx.add(x2);
                        qy.add(y2);
                        visit[x2][y2]=true;
                    }
                }
            }
        }


    }


}
