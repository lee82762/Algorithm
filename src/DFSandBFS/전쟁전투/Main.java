package DFSandBFS.전쟁전투;

import java.util.*;

public class Main {
    static int cnt=0;
    static int cnt1=0;
    static int N;
    static int M;
    static String dp[][];
    static boolean visit[][];
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();

        dp=new String[M][N];
        visit=new boolean[M][N];

        for(int i=0; i<M; i++){
            String row=sc.next();
            for(int j=0; j<N; j++){
                dp[i][j]= String.valueOf(row.charAt(j));
            }
        }
        int Blue=0;

        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(visit[i][j]==false&&dp[i][j].equals("B")){
                    bfs(i,j,"B");
                    Blue+=(cnt+1)*(cnt+1);
                    cnt=0;
                }
            }
        }

        visit=new boolean[M][N];
        int White=0;
        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                if(visit[i][j]==false&&dp[i][j].equals("W")){
                    bfs(i,j,"W");

                    White+=(cnt+1)*(cnt+1);
                    cnt=0;
                }
            }
        }
        System.out.println(White+" "+Blue);




    }
    public static void bfs(int x,int y,String s) {
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
                if(x2>=0&&x2<M&&y2>=0&&y2<N){
                    if(visit[x2][y2]==false&&dp[x2][y2].equals(s)){
                        qx.add(x2);
                        qy.add(y2);
                        visit[x2][y2]=true;
                        cnt++;

                    }

                }
            }
        }


    }


}
