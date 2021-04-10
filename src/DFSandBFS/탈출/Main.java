package DFSandBFS.탈출;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static boolean visit[][];
    static String map[][];
    static int count[][];
    static int R;
    static int C;
    static  int dx[]={1,-1,0,0};
    static  int dy[]={0,0,1,-1};
    static Queue<Pair>q=new LinkedList<>();

    static class Pair{
        int x;
        int y;
        public Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        R=sc.nextInt();
        C=sc.nextInt();

        map=new String[R][C];
        visit=new boolean[R][C];

        count=new int[R][C];
        for(int i=0;i<R;i++) {
            String row = sc.next();
            for (int j = 0; j < C; j++) {
                map[i][j] = String.valueOf(row.charAt(j));
            }
        }

        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                if(map[i][j].equals("*")){
                    q.add(new Pair(i,j));
                    visit[i][j]=true;
                }
            }
        }
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                if(map[i][j].equals("S")){
                    q.add(new Pair(i,j));
                    visit[i][j]=true;
                }
            }
        }
        bfs();

        int answer=0;
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                if(map[i][j].equals("D")){
                    answer=count[i][j];
                }
            }
        }
        if(answer==0){
            System.out.println("KAKTUS");
        }
        else{
            System.out.println(answer);
        }

    }
    static void bfs(){
        while (!q.isEmpty()){
            Pair p=q.poll();
            int x1=p.x;
            int y1=p.y;

            if(map[x1][y1].equals("*")) {
                for (int i = 0; i < 4; i++) {
                    int x2 = x1 + dx[i];
                    int y2 = y1 + dy[i];
                    if (x2 >= 0 && x2 < R && y2 >= 0 && y2 < C) {
                        if (visit[x2][y2] == false && map[x2][y2].equals(".")) {
                            map[x2][y2] = "*";
                            q.add(new Pair(x2, y2));
                        }
                    }
                }
            }

            if(map[x1][y1].equals("S")){
                for (int i = 0; i < 4; i++) {
                    int x2 = x1 + dx[i];
                    int y2 = y1 + dy[i];
                    if (x2 >= 0 && x2 < R && y2 >= 0 && y2 < C) {
                        if ((visit[x2][y2] == false && map[x2][y2].equals("."))||map[x2][y2].equals("D")) {
                            if(map[x2][y2].equals("D")){
                                count[x2][y2]=count[x1][y1]+1;
                                return;
                            }
                            count[x2][y2]=count[x1][y1]+1;
                            map[x2][y2]="S";
                            q.add(new Pair(x2, y2));
                        }
                    }
                }

            }


        }



    }
}
