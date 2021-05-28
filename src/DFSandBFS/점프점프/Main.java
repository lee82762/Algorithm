package DFSandBFS.점프점프;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int answer=0;
    static int N;
    static int arr[];
    static boolean visit[];
    static int dx[]={-1,1};
    static int S;

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        arr=new int[N];
        visit=new boolean[N];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        S=sc.nextInt();

        bfs(S-1);
        System.out.println(answer+1);


    }
    static void bfs(int x){

        Queue<Integer>queue=new LinkedList<>();
        queue.add(x);
        visit[x]=true;

        while (!queue.isEmpty()){
            int x1=queue.poll();
            for(int i=0; i<2; i++){
                int x2=x1+(dx[i]*arr[x1]);
                if(x2>=0&&x2<N&&visit[x2]==false){
                    queue.add(x2);
                    answer++;
                    visit[x2]=true;

                }

            }



        }

    }


}