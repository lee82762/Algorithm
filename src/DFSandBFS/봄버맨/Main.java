package DFSandBFS.봄버맨;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int R;
    static int C;
    static int cnt=1;
    static String map[][];
    static boolean visit[][];
    static Queue<Integer>qx=new LinkedList<>();
    static Queue<Integer>qy=new LinkedList<>();
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static int N;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        R=sc.nextInt();
        C=sc.nextInt();
        N=sc.nextInt();
        map=new String[R][C];
        visit=new boolean[R][C];

        for(int i=0; i<R; i++){
            String s=sc.next();
            for(int j=0; j<C; j++){
                map[i][j]=String.valueOf(s.charAt(j));
            }
        }

        if(N%2==0){
            for(int i=0; i<R; i++){
                for(int j=0; j<C; j++){
                    map[i][j]="O";
                }
            }

        }
        else{

            for(int k=3; k<=N; k++) {
                if (k % 2 == 1) {
                    for (int i = 0; i < R; i++) {
                        for (int j = 0; j < C; j++) {
                            if (map[i][j].equals("O")) {
                                qx.add(i);
                                qy.add(j);

                            }
                        }
                    }
                    bfs();


                    for(int i=0; i<R; i++){
                        for(int j=0; j<C; j++){
                            if(map[i][j].equals("O")){
                                map[i][j]=".";
                            }
                            else {
                                map[i][j] = "O";
                            }
                        }

                    }


                }
            }

        }

        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                System.out.print(map[i][j]);
            }
            System.out.println(" ");
        }


    }
    public static void bfs(){
        while (!qx.isEmpty()&&!qy.isEmpty()){

            int x1=qx.poll();
            int y1=qy.poll();

            for(int i=0; i<4; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];
                if(x2>=0&&x2<R&&y2>=0&&y2<C){
                    if(map[x2][y2].equals(".")){
                        map[x2][y2]="O";
                    }

                }

            }
        }


    }

}
