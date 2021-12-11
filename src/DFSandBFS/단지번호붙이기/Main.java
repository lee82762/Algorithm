package DFSandBFS.단지번호붙이기;
import java.util.*;

public class Main {
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static int map[][];
    static boolean visit[][];
    static int N;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        map=new int[N][N];
        visit=new boolean[N][N];
        for(int i=0; i<N; i++){
            String s=sc.next();
            for(int j=0; j<N; j++){
                map[i][j]=Integer.parseInt(String.valueOf(s.charAt(j)));
            }
        }
        ArrayList<Integer>a1=new ArrayList<>();
        int answer=0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(visit[i][j]==false && map[i][j]==1){
                    answer++;
                    int cnt=bfs(i,j);
                    a1.add(cnt);
                }
            }
        }

        Collections.sort(a1);
        System.out.println(answer);
        for(int a: a1){
            System.out.println(a);
        }
    }
    static public int bfs(int x, int y){
        int res=1;
        Queue<Integer>qx=new LinkedList<>();
        Queue<Integer>qy=new LinkedList<>();
        qx.add(x);
        qy.add(y);
        visit[x][y]=true;

        while (!qx.isEmpty() && !qy.isEmpty()){
            int x1=qx.poll();
            int y1=qy.poll();

            for(int i=0; i<4; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];

                if(x2>=0 && x2<N && y2>=0 && y2<N){
                    if(visit[x2][y2]==false && map[x2][y2]==1){
                        qx.add(x2);
                        qy.add(y2);
                        visit[x2][y2]=true;
                        res++;
                    }
                }
            }

        }
        return res;
    }
}
