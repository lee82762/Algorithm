package DFSandBFS.바닥장식;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static String arr[][];
    static boolean visit[][];
    static int answer=0;
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        arr=new String[N][M];
        visit=new boolean[N][M];

        for(int i=0; i<N; i++){
            String s=sc.next();
            for(int j=0; j<M; j++){
                arr[i][j]=String.valueOf(s.charAt(j));
            }
        }
        int answer=0;


        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(visit[i][j]==false){
                    System.out.println(i);
                    System.out.println(j);
                    System.out.println(" ");
                    bfs(i,j);
                    answer++;
                }
            }
        }
        System.out.println(answer);



    }
    static void bfs(int x,int y){
        Queue<Integer>qx=new LinkedList<>();
        Queue<Integer>qy=new LinkedList<>();
        visit[x][y]=true;
        qx.add(x);
        qy.add(y);


        while (!qx.isEmpty()&&!qy.isEmpty()){
            int x1=qx.poll();
            int y1=qy.poll();
            System.out.println(x1);
            System.out.println(y1);

            if(arr[x1][y1].equals("-")){
                if(x1>=0&&x1<N&&y1+1>=0&&y1+1<M){
                    if(visit[x1][y1+1]==false&&arr[x1][y1+1].equals("-")){
                        qx.add(x1);
                        qy.add(y1+1);
                        visit[x1][y1+1]=true;
                    }
                }
            }
            else
            {
                if(x1+1>=0&&x1+1<N&&y1>=0&&y1<M){
                    if(visit[x1+1][y1]==false&&arr[x1+1][y1].equals("|")){
                        qx.add(x1+1);
                        qy.add(y1);
                        visit[x1+1][y1]=true;
                    }
                }

            }
        }



    }
}