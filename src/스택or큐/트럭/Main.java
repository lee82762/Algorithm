package 스택or큐.트럭;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    static int N;
    static int W;
    static int L;
    static int []truck;
    public static void main(String argp[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        W=sc.nextInt();
        L=sc.nextInt();
        truck=new int[N];
        for(int i=0; i<N; i++){
            truck[i]=sc.nextInt();
        }
        Queue<Integer>queue=new LinkedList<>();
        int answer=0;
        int sum=0;
        for(int i=0; i<truck.length; i++){
            while (true){
                if(queue.isEmpty()){
                    queue.add(truck[i]);
                    sum+=truck[i];
                    answer++;
                    break;
                }
                else if(queue.size()==W){
                    sum-=queue.poll();
                }
                else{
                    if(sum+truck[i]>L){
                        queue.add(0);
                        answer++;
                    }
                    else{
                        queue.add(truck[i]);
                        sum+=truck[i];
                        answer++;
                        break;
                    }
                }
            }
        }
        System.out.println(answer+W);

    }
}
