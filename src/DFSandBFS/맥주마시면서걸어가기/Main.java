package DFSandBFS.맥주마시면서걸어가기;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int K;
    static int N;
    static int arr[][];
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        K=sc.nextInt();
        for(int k=0; k<K; k++) {
            N = sc.nextInt();
            arr = new int[N + 2][2];
            for (int i = 0; i < N + 2; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = sc.nextInt();
            }
            if (bfs()) {
                System.out.println("happy");
            } else {
                System.out.println("sad");
            }
        }

    }
    static public boolean bfs(){
        int k=20;
        boolean visit[]=new boolean[N+1];
        Queue<Integer>qx=new LinkedList<>();
        Queue<Integer>qy=new LinkedList<>();
        qx.add(arr[0][0]);
        qy.add(arr[0][1]);
        int cnt=1;
        while (!qx.isEmpty() && !qy.isEmpty()){
            int x=qx.poll();
            int y=qy.poll();
            if(Math.abs(x-arr[N+1][0])+Math.abs(y-arr[N+1][1]) <= 1000){
                return true;
            }
            for(int i=1; i<N+1; i++){
                if(visit[i]==false){
                    int x2=arr[i][0];
                    int y2=arr[i][1];
                    int dis=Math.abs(x-x2)+Math.abs(y-y2);
                    if(dis <= 1000){
                        visit[i]= true;
                        qx.add(x2);
                        qy.add(y2);
                    }
                }
            }
        }
        return false;
    }

}
