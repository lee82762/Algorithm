package DFSandBFS.케빈베이컨6단계법칙;

import java.util.*;

public class Main {
    static int cnt=0;
    static int N;
    static int M;
    static int dp[][];
    static boolean visit[];

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        dp=new int[N][N];
        visit=new boolean[N];

        for(int i=0; i<M; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            dp[a-1][b-1]=1;
            dp[b-1][a-1]=1;
        }

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0; i<N; i++){
            map.put(i,bfs(i));
            visit=new boolean[N];
        }
        ArrayList<Integer>s1=new ArrayList<>(map.keySet());
        Collections.sort(s1,(o1, o2) -> map.get(o1).compareTo(map.get(o2)));
        System.out.println(s1.get(0)+1);



    }

    static public int bfs(int x){
        int re[]=new int[N];
        Queue<Integer>qx=new LinkedList<>();
        qx.add(x);
        visit[x]=true;

        while (!qx.isEmpty()){
            int x1=qx.poll();
            for(int i=0; i<N; i++){
                if(dp[x1][i]==1&&visit[i]==false){
                    qx.add(i);
                    re[i]+=re[x1]+1;
                    visit[i]=true;

                }
            }


        }
        int ans=0;
        for(int i=0; i<re.length; i++){
            ans+=re[i];

        }
        return ans;


    }




}
