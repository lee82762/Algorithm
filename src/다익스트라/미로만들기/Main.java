package 다익스트라.미로만들기;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    static int n;
    static boolean visit[][];
    static int dp[][];
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static int count=0;

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
        n=sc.nextInt();

        dp=new int[n][n];
        visit=new boolean[n][n];
        sc.nextLine();

        for(int i=0; i<n; i++){
            String s=sc.nextLine();
            for(int j=0; j<n; j++){
                dp[i][j]=s.charAt(j)-'0';
            }
        }
        bfs(0,0);

        System.out.println(count);

    }
    public static void bfs(int x, int y){
        PriorityQueue<Pair>queue=new PriorityQueue<>();
        queue.add(new Pair(x,y,0));
        visit[x][y]=true;

        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x1=p1.x;
            int y1=p1.y;
            int cnt1=p1.cnt;
            if(x1==n-1&&y1==n-1){
                count=cnt1;
                break;
            }

            for(int i=0; i<4; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];
                if(x2>=0&&x2<n&&y2>=0&&y2<n){
                    if(visit[x2][y2]==false&&dp[x2][y2]==1){
                        visit[x2][y2]=true;
                        queue.add(new Pair(x2,y2,cnt1));
                    }

                    if(visit[x2][y2]==false&&dp[x2][y2]==0){
                        visit[x2][y2]=true;
                        queue.add(new Pair(x2,y2,cnt1+1));
                    }

                }
            }


        }





    }
}
