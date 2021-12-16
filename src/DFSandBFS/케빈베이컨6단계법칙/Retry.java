package DFSandBFS.케빈베이컨6단계법칙;

import java.util.*;

public class Retry {
    static int n;
    static int m;
    static boolean visit[];
    static int d[];
    static ArrayList<Integer>dp[];
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        visit=new boolean[n+1];
        dp=new ArrayList[n+1];
        for(int i=0; i<=n; i++){
            dp[i]=new ArrayList<>();
        }

        for(int i=0; i<m; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();

            dp[a].add(b);
            dp[b].add(a);
        }

        int min=Integer.MAX_VALUE;
        int answer=0;
        for(int i=1; i<=n; i++) {
            int temp = 0;
            bfs(i);
            for (int j = 1; j <= n; j++) {
                temp+=d[j];
            }

            if(min>temp){
                min=temp;
                answer=i;
            }
        }
        System.out.println(answer);


    }
    static public void bfs(int x){
        d=new int[n+1];
        visit=new boolean[n+1];
        Queue<Integer>queue=new LinkedList<>();
        queue.add(x);
        visit[x]=true;

        while (!queue.isEmpty()){
            int a1=queue.poll();
            for(int a : dp[a1]){
                if(visit[a]==false){
                    queue.add(a);
                    d[a]=d[a1]+1;
                    visit[a]=true;

                }
            }
        }
    }

}
