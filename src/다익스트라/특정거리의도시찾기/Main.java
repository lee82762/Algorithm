package 다익스트라.특정거리의도시찾기;

import java.util.*;
//다익스트라 ,bfs 구현
public class Main {
    static int cnt=0;
    static int max=0;
    static int N;
    static int M;
    static int K;
    static int X;
    static boolean visit[];
    static int count[];
    static ArrayList<Integer>dp[];
    static ArrayList<Integer>a1=new ArrayList<>();


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        K=sc.nextInt();
        X=sc.nextInt();

        visit=new boolean[N];
        dp=new ArrayList[N];
        for(int i=0; i<N; i++){
            dp[i]=new ArrayList<>();
        }

        for(int i=0; i<M; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            dp[a-1].add(b-1);


        }

        bfs(X-1);
        for(int i=0; i<count.length; i++){
            if(K==count[i]){
                a1.add(i+1);
            }
        }
        Collections.sort(a1);
        if(a1.isEmpty()){
            System.out.println("-1");
            return;
        }
        else{
            for(int i=0; i<a1.size(); i++){
                System.out.println(a1.get(i));
            }
        }




    }
    static public void bfs(int x){
        count=new int[N];

        Queue<Integer>qx=new LinkedList<>();
        qx.add(x);
        visit[x]=true;

        while (!qx.isEmpty()){
            int x1=qx.poll();
            for(int idx : dp[x1]){
                if(!visit[idx]){
                    qx.add(idx);
                    visit[idx]=true;
                    count[idx]=count[x1]+1;
                }
            }

        }

    }

}
