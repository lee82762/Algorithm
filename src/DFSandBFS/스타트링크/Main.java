package DFSandBFS.스타트링크;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

//bfs효율 생각
// Arrays.fill(dp, -1); 이유생각해보기
//다시풀어보기

public class Main {
    static int cnt=0;
    static int F;
    static int S;
    static int G;
    static int U;
    static int D;
    static int dp[];
    static boolean visit[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        F=sc.nextInt();
        S=sc.nextInt();
        G=sc.nextInt();
        U=sc.nextInt();
        D=sc.nextInt();
        dp=new int[F+1];
        visit=new boolean[F+1];
        Arrays.fill(dp, -1);
        bfs(S);

        if(dp[G]==-1&&S!=G){
            System.out.println("use the stairs");
        }
        else{
            System.out.println(dp[G]+1);
        }




    }

    static public void bfs(int x){
        Queue<Integer>q=new LinkedList<>();
        q.add(x);
        visit[x]=true;

        while (!q.isEmpty()){
            int x1=q.poll();

            if(x1==G){
                return;
            }

            if(x1+U<=F&&visit[x1+U]==false){
                q.add(x1+U);
                visit[x1+U]=true;
                dp[x1+U]=dp[x1]+1;
            }

            if(x1-D>0&&visit[x1-D]==false){
                q.add(x1-D);
                visit[x1-D]=true;
                dp[x1-D]=dp[x1]+1;
            }

        }



    }




}
