package DFSandBFS.중량제한;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int answer=0;
    static int d[];
    static boolean visit[];
    static ArrayList<Pair>dp[];
    static class Pair{
        int idx;
        int dis;
        public Pair(int idx, int dis){
            this.idx=idx;
            this.dis=dis;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        d=new int[N+1];
        dp=new ArrayList[N+1];
        for(int i=0; i<=N; i++){
            dp[i]=new ArrayList<>();
        }
        int left=0;
        int right=0;

        for(int i=0; i<M; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            dp[a].add(new Pair(b,c));
            dp[b].add(new Pair(a,c));
            right=Math.max(right,c);
        }
        int X=sc.nextInt();
        int Y=sc.nextInt();

        while (left<=right){
            int mid=(left+right)/2;
            visit=new boolean[N+1];
            if(dik(X,Y,mid)){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        System.out.println(right);
    }
    static public boolean dik(int X,int Y,int mid){
        Queue<Integer>queue=new LinkedList<>();
        queue.add(X);
        visit[X]=true;
        while (!queue.isEmpty()){
            int x1=queue.poll();
            if(x1==Y){
                return true;
            }

            for(Pair next : dp[x1]){
                if(visit[next.idx]==false &&mid<=next.dis){
                    queue.add(next.idx);
                    visit[next.idx]=true;
                }
            }
        }
        return false;
    }
}
