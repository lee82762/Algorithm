package DFSandBFS.나무탈출;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    static int N,K;
    static ArrayList<Integer> dp[];
    static boolean visit[];
    static int answer=0;
    public static void main(String arg[])throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        dp=new ArrayList[N];
        visit=new boolean[N];
        for(int i=0; i<N; i++){
            dp[i]=new ArrayList<>();
        }

        for(int i=0; i<N-1; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            dp[x-1].add(y-1);
            dp[y-1].add(x-1);
        }
        dfs(0,0);

        bw.write((answer % 2 == 0) ? "No" : "Yes");
        bw.flush();
        bw.close();
        br.close();
    }
    public static void dfs(int x,int dis){
        visit[x]=true;
        for(Integer next : dp[x]){
            if(visit[next]==false){
                dfs(next,dis+1);
            }
        }
        if(x!=0 && dp[x].size() ==1 ){
            answer+=dis;
            return;
        }
    }
}
