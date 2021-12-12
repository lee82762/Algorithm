package DFSandBFS.순열사이클;
import java.util.*;

public class Retry {
    static int N;
    static int M;
    static int map[][];
    static boolean visit[];
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        for(int k=0; k<N; k++) {
            M = sc.nextInt();
            map = new int[M + 1][M + 1];
            for (int i = 1; i <= M; i++) {
                int a = sc.nextInt();
                map[i][a] = 1;
            }
            visit = new boolean[M + 1];

            int answer = 0;
            for (int i = 1; i <= M; i++) {
                if (visit[i] == false) {
                    dfs(i);
                    answer++;
                }
            }
            System.out.println(answer);
        }



    }
    static public void dfs(int x){
        for(int i=1; i<map.length; i++){
            if(map[x][i]==1 && visit[i]==false){
                visit[i]=true;
                dfs(i);
            }
        }

    }
}
