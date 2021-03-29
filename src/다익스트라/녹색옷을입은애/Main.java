package 다익스트라.녹색옷을입은애;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Main {
    static int n;
    static boolean visit[][];
    static int dp[][];
    static int d[][];
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};


    static class Pair implements Comparable<Pair> {
        int x;
        int y;
        int cnt;
        public Pair(int x,int y, int cnt){
            this.x=x;
            this.y=y;
            this.cnt=cnt;
        }
        @Override
        public int compareTo(Pair o){
            return cnt-o.cnt;
        }

    }



    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        int cnt=0;
        while (true) {
            n = sc.nextInt();
            cnt++;
            if(n==0){
                break;
            }
            d = new int[n][n];

            for (int[] t : d) {
                Arrays.fill(t, 100000000);
            }


            dp = new int[n][n];
            visit = new boolean[n][n];
            sc.nextLine();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    dp[i][j] = sc.nextInt();
                }
            }


            bfs(0, 0);
            System.out.println("Problem "+cnt+": "+d[n-1][n-1]);

        }



    }
    public static void bfs(int x, int y){
        PriorityQueue<Pair>queue=new PriorityQueue<>();
        d[x][y]=dp[x][y];


        queue.add(new Pair(x,y,dp[x][y]));


        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x1=p1.x;
            int y1=p1.y;
            int cnt1=p1.cnt;


            if(x1==n-1&&y1==n-1){
                break;
            }

            for(int i=0; i<4; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];

                if(x2>=0&&x2<n&&y2>=0&&y2<n){
                    if(d[x2][y2]>d[x1][y1]+dp[x2][y2]){
                        visit[x2][y2]=true;
                        d[x2][y2]=d[x1][y1]+dp[x2][y2];
                        queue.add(new Pair(x2,y2,d[x2][y2]));
                    }
                }
            }
        }





    }
}
