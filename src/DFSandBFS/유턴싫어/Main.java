package DFSandBFS.유턴싫어;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int R;
    static int C;
    static String map[][];
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
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        R=sc.nextInt();
        C=sc.nextInt();
        map=new String[R][C];

        for(int i=0; i<R; i++){
            String s=sc.next();
            for(int j=0; j<C; j++){
                map[i][j]=String.valueOf(s.charAt(j));
            }
        }

        boolean answer=true;

        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                if(map[i][j].equals(".")){
                    boolean temp=bfs(i,j);
                    if(temp==false){
                        answer=false;
                        break;
                    }
                }
            }
            if(answer==false){
                break;
            }
        }

        if(answer==false){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }



    }
    static boolean bfs(int x,int y){

        Queue<Pair>queue=new LinkedList<>();
        queue.add(new Pair(x,y));

        Pair p1=queue.poll();
        int x1=p1.x;
        int y1=p1.y;

        for(int i=0; i<4; i++){
            int x2=x1+dx[i];
            int y2=y1+dy[i];
            if(x2>=0&&x2<R&&y2>=0&&y2<C){
                if(map[x2][y2].equals(".")){
                    queue.add(new Pair(x2,y2));
                }
            }
        }

        if(queue.size()>=2){
            return true;
        }
        else{
            return false;
        }
    }
}
