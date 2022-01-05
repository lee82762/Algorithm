package 스택or큐.요세푸스문제;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N;
    static int K;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        K=sc.nextInt();
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0; i<N; i++){
            queue.add(i+1);
        }

        K=K-1;

        String s="";
        s+="<";
        while (!queue.isEmpty()){
            for(int i=0; i<K; i++){
                int val=queue.poll();
                queue.add(val);
            }
            s+=queue.poll()+", ";
        }
        s=s.substring(0,s.length()-2);
        s+=">";
        System.out.println(s);



    }
}
