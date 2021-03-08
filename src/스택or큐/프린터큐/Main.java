package 스택or큐.프린터큐;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    static int  A;
    static  int B;
    static  int T;
    static int dp[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T=sc.nextInt();
        for(int j=0; j<T; j++){
            A=sc.nextInt();
            B=sc.nextInt();
            dp=new int[A];
            for(int i=0; i<A; i++){
                dp[i]=sc.nextInt();
            }
            PriorityQueue<Integer>qu=new PriorityQueue<>(Comparator.reverseOrder());
            for(int i=0; i<dp.length; i++){
                qu.add(dp[i]);
            }

            int answer=0;
            int an=0;
            while (qu.size()!=0){
                for(int i=0;i<dp.length; i++){
                    if(dp[i]==qu.peek()){
                        if(B==i){
                            qu.poll();
                            an++;
                            answer=an;
                            qu.clear();
                            break;
                        }
                        else{
                            an++;
                            qu.poll();
                            continue;
                        }
                    }
                }
            }
            System.out.println(answer);
        }


    }

}
