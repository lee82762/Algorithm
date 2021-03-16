package DFSandBFS.영역구하기;

import java.util.*;

public class Main {
    static int N;
    static int M;
    static int K;
    static int cnt=0;
    static int cnt1=0;
    static int dp[][];
    static boolean visit[][];
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        M = sc.nextInt();
        N = sc.nextInt();
        K = sc.nextInt();

        dp = new int[M][N];

        visit = new boolean[M][N];
        for (int i = 0; i < K; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();


            for (int k = b; k < d; k++) {
                for (int j = a; j < c; j++) {
                    dp[k][j] = 1;
                }
            }

        }
        ArrayList<Integer>s1=new ArrayList<>();

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if(visit[i][j]==false&&dp[i][j]!=1){
                    bfs(i,j);
                    s1.add(cnt+1);
                    cnt=0;
                    cnt1++;
                }

            }
        }
        System.out.println(cnt1);
        Collections.sort(s1);
        for(int i=0; i<s1.size(); i++){
            System.out.print(s1.get(i)+" ");
        }

    }
    public static void bfs(int x,int y){
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
                    if(visit[x2][y2]==false&&dp[x2][y2]!=1){
                        visit[x2][y2]=true;
                        qx.add(x2);
                        qy.add(y2);
                        cnt++;
                    }
                }
            }
        }

    }





}

