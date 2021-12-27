package DFSandBFS.인구이동;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N;
    static int L;
    static int R;
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static boolean visit[][];
    static int map[][];
    static ArrayList<Pair>list;
    static class Pair{
        int x;
        int y;
        public Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        L=sc.nextInt();
        R=sc.nextInt();
        map=new int[N][N];
        visit=new boolean[N][N];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                map[i][j]=sc.nextInt();
            }
        }

        System.out.println(move());

    }
    static public int move(){
        int answer=0;
        while (true){
            boolean check=false;
            visit=new boolean[N][N];
            for(int i=0; i<N; i++){
                for(int j=0; j<N; j++){
                    if(visit[i][j]==false){
                        int sum=bfs(i,j);
                        if(list.size()>1){
                            change(sum);
                            check=true;
                        }
                    }
                }
            }
            if(check==false){
                return answer;
            }
            answer++;

        }
    }
    static public int bfs(int x, int y) {
        int sum = 0;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(x, y));
        list=new ArrayList<>();
        list.add(new Pair(x, y));
        visit[x][y] = true;
        sum += map[x][y];
        while (!queue.isEmpty()) {
            Pair p1 = queue.poll();
            int x1 = p1.x;
            int y1 = p1.y;
            for (int i = 0; i < 4; i++) {
                int x2 = x1 + dx[i];
                int y2 = y1 + dy[i];

                if (x2 >= 0 && x2 < N && y2 >= 0 && y2 < N && visit[x2][y2]==false) {
                    int a = Math.abs(map[x1][y1] - map[x2][y2]);
                    if ( a >= L && a <= R) {
                        queue.add(new Pair(x2, y2));
                        list.add(new Pair(x2, y2));
                        sum += map[x2][y2];
                        visit[x2][y2] = true;
                    }
                }
            }
        }
        return sum;
    }
    static public void change(int sum){
        int avg=sum/list.size();

        for(int i=0; i<list.size(); i++){
            Pair p1=list.get(i);
            map[p1.x][p1.y]=avg;
        }

    }
}
