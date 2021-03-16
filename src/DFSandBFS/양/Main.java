package DFSandBFS.양;

import java.util.*;

public class Main {
    static int R;
    static int C;
    static String dp[][];
    static boolean visit[][];
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static int wolf=0;
    static int sheep=0;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        R=sc.nextInt();
        C=sc.nextInt();

        dp=new String[R][C];
        visit=new boolean[R][C];

        for(int i=0; i<R; i++){
            String row=sc.next();
            for(int j=0; j<C; j++){
                dp[i][j]= String.valueOf(row.charAt(j));
            }
        }
        int cnt=0;
        int rewolf=0;
        int resheep=0;


        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                if(visit[i][j]==false&&!dp[i][j].equals("#")){
                    bfs(i,j);

                    if(sheep>wolf){
                        resheep+=sheep;
                    }
                    else {
                        rewolf+=wolf;
                    }
                    wolf=0;
                    sheep=0;

                }
            }

        }

        System.out.println(resheep+" "+rewolf);




    }
    public static void bfs(int x,int y) {
        Queue<Integer>qx=new LinkedList<>();
        Queue<Integer>qy=new LinkedList<>();

        qx.add(x);
        qy.add(y);
        visit[x][y]=true;
        if(dp[x][y].equals("v")){
            wolf++;
        }
        if(dp[x][y].equals("o")){
            sheep++;
        }

        while (!qx.isEmpty()&&!qy.isEmpty()){
            int x1=qx.poll();
            int y1=qy.poll();

            for(int i=0; i<4; i++) {
                int x2 = x1 + dx[i];
                int y2 = y1 + dy[i];

                if (x2 >= 0 && x2 < R && y2 >= 0 && y2 < C) {

                    if (visit[x2][y2] == false && !dp[x2][y2].equals("#")) {

                        if(dp[x2][y2].equals("v")){
                            wolf++;
                        }
                        if(dp[x2][y2].equals("o")){
                            sheep++;
                        }

                        qx.add(x2);
                        qy.add(y2);
                        
                        visit[x2][y2] = true;


                    }
                }
            }
        }

    }

}
