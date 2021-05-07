package DFSandBFS.적록색약;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N;
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    static String arr[][];
    static String arr1[][];
    static boolean visit[][];
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        arr=new String[N][N];
        arr1=new String[N][N];
        visit=new boolean[N][N];

        for(int i=0; i<N; i++){
            String s=sc.next();
            for(int j=0; j<N; j++){
                arr[i][j]=String.valueOf(s.charAt(j));
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(arr[i][j].equals("G")){
                    arr1[i][j]="R";
                }
                else{
                    arr1[i][j]=arr[i][j];
                }
            }
        }


        int red=0;
        int green=0;
        int blue=0;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(visit[i][j]==false&&arr[i][j].equals("R")){
                    bfs(i,j,"R",arr);
                    red++;
                }
                if(visit[i][j]==false&&arr[i][j].equals("G")){
                    bfs(i,j,"G",arr);
                    green++;
                }
                if(visit[i][j]==false&&arr[i][j].equals("B")){
                    bfs(i,j,"B",arr);
                    blue++;
                }
            }

        }

        int answer=red+green+blue;
        red=0;
        blue=0;
        visit=new boolean[N][N];

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(visit[i][j]==false&&arr1[i][j].equals("R")){
                    bfs(i,j,"R",arr1);
                    red++;
                }
                if(visit[i][j]==false&&arr1[i][j].equals("B")){
                    bfs(i,j,"B",arr1);
                    blue++;
                }
            }

        }

        int answer1=red+blue;
        System.out.println(answer+" "+answer1);


    }
    static void bfs(int x,int y,String s,String [][]s1){
        Queue<Integer>qx=new LinkedList<>();
        Queue<Integer>qy=new LinkedList<>();
        qx.add(x);
        qy.add(y);
        visit[x][y]=true;

        while (!qx.isEmpty()&&!qy.isEmpty()){
            int x1=qx.poll();
            int y1=qy.poll();

            for(int i=0; i<4; i++){
                int x2=x1+dx[i];
                int y2=y1+dy[i];

                if(x2>=0&&x2<N&&y2>=0&&y2<N){
                    if(visit[x2][y2]==false&&s1[x2][y2].equals(s)){
                        qx.add(x2);
                        qy.add(y2);
                        visit[x2][y2]=true;
                    }
                }
            }
        }

    }

}
