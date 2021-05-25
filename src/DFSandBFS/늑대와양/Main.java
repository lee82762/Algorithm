package DFSandBFS.늑대와양;

import java.util.*;

public class Main{
    static int N;
    static int M;
    static int dx[]={-1,1,0,0};
    static int dy[]={0,0,1,-1};
    static String map[][];
    static boolean visit[][];
    static boolean flag=true;
    static class Pair{
        int x;
        int y;
        public Pair(int x, int y){
            this.x=x;
            this.y=y;
        }
    }


    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();

        map=new String[N][M];
        visit=new boolean[N][M];

        for(int i=0; i<N; i++){
            String s=sc.next();
            for(int j=0; j<M; j++){
                map[i][j]=String.valueOf(s.charAt(j));
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(visit[i][j]==false&&map[i][j].equals("W")){
                    if(flag==true) {
                        bfs(i, j);
                    }
                }
            }
            if(flag==false){
                break;
            }
        }

        if(flag==true){
            System.out.println("1");
            for(int i=0; i<N; i++){
                for(int j=0; j<M; j++){
                    System.out.print(map[i][j]);
                }
                System.out.println(" ");
            }
        }
        else {
            System.out.println("0");
        }




    }
    static void bfs(int x, int y){

        Queue<Pair>queue=new LinkedList<>();
        queue.add(new Pair(x,y));
        visit[x][y]=true;

        Pair p1=queue.poll();
        int x1=p1.x;
        int y1=p1.y;

        for(int i=0; i<4; i++){
            int x2=x1+dx[i];
            int y2=y1+dy[i];

            if(x2>=0&&x2<N&&y2>=0&&y2<M){
                if(visit[x2][y2]==false && map[x2][y2].equals(".")){
                    map[x2][y2]="D";
                }
                else if(visit[x2][y2]==false && map[x2][y2].equals("S")){
                    flag=false;
                    break;
                }
            }
        }



    }
}
