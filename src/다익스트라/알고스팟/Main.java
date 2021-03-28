package 다익스트라.알고스팟;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static int n;
    static int m;
    static int dp[][];
    static boolean visit[][];
    static int count=0;
    static PriorityQueue<Pair>queue=new PriorityQueue<>();
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};


    static class Pair implements Comparable<Pair> {
        int x;
        int y;
        int cnt;
        public Pair(int x,int y,int cnt){
            this.x=x;
            this.y=y;
            this.cnt=cnt;
        }

        @Override
        public int compareTo(Pair o) {
            return cnt>o.cnt?1:cnt==o.cnt?0:-1;
        }
    }

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        n=sc.nextInt();
        sc.nextLine();
        dp=new int[n][m];
        visit=new boolean[n][m];

        for(int i=0;i<n;i++) {
            String s= sc.nextLine();
            for(int j=0;j<m;j++) {
                dp[i][j]=s.charAt(j)-'0';
            }
        }
        bfs(0,0);

        System.out.println(count);


    }
    public static void bfs(int x, int y){
        queue.add(new Pair(x,y,0));
        visit[x][y]=true;

        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x1=p1.x;
            int y1=p1.y;
            int cnt1=p1.cnt;
            if(x1==n-1&&y1==m-1){
                count=cnt1;
            }
            for(int i=0; i<4; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];

                if(x2>=0&&x2<n&&y2>=0&&y2<m){
                    if(dp[x2][y2]==0&&visit[x2][y2]==false){
                        visit[x2][y2]=true;
                        queue.add(new Pair(x2,y2,cnt1));
                    }

                    if(dp[x2][y2]==1&&visit[x2][y2]==false){
                        visit[x2][y2]=true;
                        queue.add(new Pair(x2,y2,cnt1+1));

                    }

                }
            }
        }

    }
}
