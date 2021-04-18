package DFSandBFS.상범빌딩;

import java.util.*;

public class Main {
    static int L;
    static int answer=0;
    static int R;
    static int C;
    static String dp[][];
    static boolean visit[][];

    static class Pair{
        int x;
        int y;
        int cnt;
        public Pair(int x,int y,int cnt){
            this.x=x;
            this.y=y;
            this.cnt=cnt;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        while (true) {

            L = sc.nextInt();
            R = sc.nextInt();
            C = sc.nextInt();
            if(L==0&&R==0&&C==0){
                break;
            }

            dp = new String[L * R][C];
            visit = new boolean[L * R][C];
            int dx[] = {1, -1, 0, 0, R, -R};
            int dy[] = {0, 0, 1, -1, 0, 0};
            for (int i = 0; i < L * R; i++) {
                String s = sc.next();
                for (int j = 0; j < C; j++) {
                    dp[i][j] = String.valueOf(s.charAt(j));
                }
            }

            for (int i = 0; i < L * R; i++) {
                for (int j = 0; j < C; j++) {
                    if (dp[i][j].equals("S")) {

                        bfs(i, j, dx, dy);
                    }
                }

            }
            if (answer > 0) {
                System.out.println("Escaped in " + answer + " minute(s).");
            } else {
                System.out.println("Trapped!");
            }
        }


    }
    static void bfs(int x,int y, int []dx, int []dy){
        answer=0;
        Queue<Pair>queue=new LinkedList<>();


        queue.add(new Pair(x,y,1));
        visit[x][y]=true;
        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x1=p1.x;
            int y1=p1.y;
            int cnt1=p1.cnt;

            for(int i=0; i<6; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];

                if(x2>=0&&x2<L*R&&y2>=0&&y2<C){
                    if(visit[x2][y2]==false&&dp[x2][y2].equals(".")){
                        visit[x2][y2]=true;
                        queue.add(new Pair(x2,y2,cnt1+1));

                    }
                    else if(visit[x2][y2]==false&&dp[x2][y2].equals("E")){
                        answer=cnt1;
                        break;
                    }
                }
            }


        }




    }
}
