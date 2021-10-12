package DFSandBFS.토마토1;

import java.util.*;
//다시풀기
public class Main {
    static int X;
    static int Y;
    static int Z;
    static ArrayList<Integer>dp[];
    static int arr[][][];
    static boolean visit[][][];
    static int S;
    static int answer=0;
    static int dx[]={1,-1,0,0,0,0};
    static int dy[]={0,0,1,-1,0,0};
    static int dz[]={0,0,0,0,1,-1};
    static class Pair{
        int x;
        int y;
        int z;
        public Pair(int x,int y,int z){
            this.x=x;
            this.y=y;
            this.z=z;
        }
    }
    static Queue<Pair>queue=new LinkedList<>();
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        Y=sc.nextInt();
        X=sc.nextInt();
        Z=sc.nextInt();

        arr=new int[Z][X][Y];
        visit=new boolean[Z][X][Y];
        int check=0;
        for(int k=0; k<Z; k++){
            for(int i=0; i<X; i++){
                for(int j=0; j<Y; j++){
                    arr[k][i][j]=sc.nextInt();
                    if(arr[k][i][j]==1){
                        queue.add(new Pair(i,j,k));
                    }
                    else if(arr[k][i][j]==0){
                        check++;
                    }

                }
            }
        }

        if(check==0){
            System.out.println("0");
        }
        else {


            bfs();
            int max = 0;
            boolean flag = true;

            for (int k = 0; k < Z; k++) {
                for (int i = 0; i < X; i++) {
                    for (int j = 0; j < Y; j++) {
                        if (arr[k][i][j] == 0) {
                            max = 0;
                            flag = false;
                            break;
                        } else {
                            max = Math.max(max, arr[k][i][j]);
                        }
                    }
                    if (flag == false) {
                        break;
                    }
                }
                if (flag == false) {
                    break;
                }

            }
            if (max == 0) {
                System.out.println("-1");
            } else {
                System.out.println(max - 1);
            }
        }



    }
    static void bfs(){

        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            int x1=p1.x;
            int y1=p1.y;
            int z1=p1.z;
            visit[z1][x1][y1]=true;


            for(int i=0; i<6; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];
                int z2=z1+dz[i];


                if(x2>=0&&x2<X&&y2>=0&&y2<Y&&z2>=0&&z2<Z){
                    if(arr[z2][x2][y2]==0&&visit[z2][x2][y2]==false){
                        arr[z2][x2][y2]=arr[z1][x1][y1]+1;
                        visit[z2][x2][y2]=true;
                        queue.add(new Pair(x2,y2,z2));
                    }
                }
            }

        }



    }
}
