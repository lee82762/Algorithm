package DFSandBFS.A에서B;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static long answer=0;
    static long A;
    static long B;
    static class Pair{
        long x;
        long cnt;
        public Pair(long x,long cnt){
            this.x=x;
            this.cnt=cnt;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        A=sc.nextLong();
        B=sc.nextLong();
        bfs(A,B);
        if(answer==0){
            System.out.println("-1");
        }
        else{
            System.out.println(answer+1);
        }



    }
    public static void bfs(long A,long B){
        Queue<Pair>queue=new LinkedList<>();
        queue.add(new Pair(A,0));

        while (!queue.isEmpty()){
            Pair p1=queue.poll();
            long x1=p1.x;
            long cnt1=p1.cnt;

            if(x1==B){
                answer=cnt1;
                break;
            }

            long re1=x1*2;

            long re2=x1*10+1;

            if(re1<=B){
                queue.add(new Pair(re1,cnt1+1));
            }
            if(re2<=B){
                queue.add(new Pair(re2,cnt1+1));
            }
        }
    }




}
