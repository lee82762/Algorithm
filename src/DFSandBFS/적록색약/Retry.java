package DFSandBFS.적록색약;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Retry {
    static String map[][];
    static boolean visit[][];
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static int N;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        map=new String[N][N];
        visit=new boolean[N][N];
        for(int i=0; i<N; i++){
            String s=sc.next();
            for(int j=0; j<s.length(); j++){
                map[i][j]=String.valueOf(s.charAt(j));
            }
        }
        int answer=0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(visit[i][j]==false && map[i][j].equals("R")){
                    bfs(i,j);

                    answer++;
                }
                else if(visit[i][j]==false && map[i][j].equals("B")){
                    bfs(i,j);
                    answer++;
                }
                else if(visit[i][j]==false && map[i][j].equals("G")){
                    bfs(i,j);
                    answer++;
                }
            }
        }

        visit=new boolean[N][N];
        int answer1=0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(map[i][j].equals("G")){
                    map[i][j]="R";
                }
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(visit[i][j]==false && map[i][j].equals("R")){
                    bfs(i,j);

                    answer1++;
                }
                else if(visit[i][j]==false && map[i][j].equals("B")){
                    bfs(i,j);
                    answer1++;
                }
            }
        }
        System.out.println(answer+" "+answer1);
    }
    static public void bfs(int x, int y){
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
                    if(visit[x2][y2]==false && map[x][y].equals(map[x2][y2])){
                        qx.add(x2);
                        qy.add(y2);
                        visit[x2][y2]=true;
                    }
                }
            }
        }
    }
}
