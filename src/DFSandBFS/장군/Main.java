package DFSandBFS.장군;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int R1;
    static int C1;
    static int R2;
    static int C2;
    static int map[][];
    static boolean visit[][];
    static int dx[] = { 2,-2,3,-3,2,-2,3,-3 };
    static int dy[] = { 3,3,2,2,-3,-3,-2,-2 };
    static class Pair{
        int x;
        int y;
        int cnt;
        public Pair(int x, int y, int cnt){
            this.x=x;
            this.y=y;
            this.cnt=cnt;
        }
    }
    static int answer=0;
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        map=new int[10][9];
        visit=new boolean[10][9];
        R1=sc.nextInt();
        C1=sc.nextInt();

        R2=sc.nextInt();
        C2=sc.nextInt();
        map[R1][C1]=1;
        map[R2][C2]=1;


        bfs(R1,C1);



        if(answer==0){
            System.out.println("-1");
        }
        else{
            System.out.println(answer);
        }


    }
    static void bfs(int x,int y){
        Queue<Pair>queue=new LinkedList<>();
        queue.add(new Pair(x,y,0));
        visit[x][y]=true;

        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x1=p1.x;
            int y1=p1.y;
            int cnt1=p1.cnt;


            if(x1==R2&&y1==C2){
                answer=cnt1;
                break;
            }

            for(int i=0; i<8; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];
                if(x2>=0&&x2<10&&y2>=0&&y2<9){
                    if(visit[x2][y2]==false && check(x2,y2,i)==true){
                        queue.add(new Pair(x2,y2,cnt1+1));
                        visit[x2][y2]=true;
                    }
                }
            }
        }

    }
    static boolean check(int x, int y,int i){
        boolean re=true;

        if(i==0 || i==2){
            if(map[x-1][y-1]==1){
                re=false;
            }
            else if(map[x-2][y-2]==1){
                re=false;
            }

        }

        else if(i==1 || i==3){
            if(map[x+1][y-1]==1){
                re=false;
            }
            else if(map[x+2][y-1]==1){
                re=false;
            }

        }
        else if(i==4 || i==6){
            if(map[x-1][y+1]==1){
                re=false;
            }
            else if(map[x-2][y+2]==1){
                re=false;
            }
        }
        else if(i==5 || i==7){
            if(map[x+1][y+1]==1){
                re=false;
            }
            else if(map[x+2][y+2]==1){
                re=false;
            }
        }


        return re;
    }
}
