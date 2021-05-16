package DFSandBFS.뿌요뿌요;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N;
    static  int M;
    static String[][] map;
    static boolean[][]visit;

    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};

    static class Pair{
        int x;
        int y;
        public Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    static int answer=0;

    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);

        N=12;
        M=6;
        map=new String[N][M];
        visit=new boolean[N][M];

        for(int i=0; i<N; i++){
            String s=sc.next();
            for(int j=0; j<M; j++){
                map[i][j]=String.valueOf(s.charAt(j));
            }
        }

        int result=0;
        while (true) {
            visit=new boolean[N][M];
            boolean cnt=false;

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (visit[i][j]==false&&!map[i][j].equals(".")) {
                        answer=1;

                        if(countcheck(i,j)){

                            for(int t=0; t<4; t++){

                            }
                            cnt=true;
                            bfs(i,j,map[i][j]);
                        }
                    }
                }

            }


            if(cnt){
                result++;
            }
            else{
                break;

            }

            change();



        }
        System.out.println(result);


    }
    static void bfs(int x, int y,String color){
        Queue<Pair>queue1=new LinkedList<>();
        queue1.add(new Pair(x,y));


        while (!queue1.isEmpty()) {
            Pair p1 = queue1.poll();
            int x1 = p1.x;
            int y1 = p1.y;
            for (int i = 0; i < 4; i++) {
                int x2 = x1 + dx[i];
                int y2 = y1 + dy[i];
                if (x2 >= 0 && x2 < N && y2 >= 0 && y2 < M) {
                    if (visit[x2][y2]==true&&color.equals(map[x2][y2])) {
                        map[x2][y2]=".";
                        queue1.add(new Pair(x2, y2));

                    }
                }
            }
        }


    }

    static public boolean countcheck(int x,int y){
        visit[x][y]=true;

        for(int i=0; i<4; i++){
            int x2=x+dx[i];
            int y2=y+dy[i];

            if (x2 >= 0 && x2 < N && y2 >= 0 && y2 < M) {
                if (visit[x2][y2]==false&&map[x][y].equals(map[x2][y2])) {
                    answer++;
                    countcheck(x2,y2);
                }
            }

        }

        if(answer>=4){

            return true;
        }
        return false;

    }

    static public void change(){

        for(int k=0; k<map.length; k++) {
            for (int i = 1; i < map.length; i++) {
                for (int j = 0; j < map[i].length; j++) {
                    if (map[i][j].equals(".")&& !map[i-1][j].equals(".")) {
                        map[i][j] = map[i - 1][j];
                        map[i - 1][j] = ".";

                    }
                }
            }
        }

    }
}

