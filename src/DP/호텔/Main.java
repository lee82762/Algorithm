package DP.호텔;

import java.util.Scanner;


//DP문제는 규칙,점화식 만들기!
public class Main {
    static int C;
    static int N;
    static int max=100*1000;

    static  int []dp;
    static  int cost[]; //비용
    static  int customer[]; //늘릴수 있는 손님수
    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);
        C=sc.nextInt(); //C명까지 만들수있는 최소 비용
        N=sc.nextInt();
        cost=new int[100];
        customer=new int[100];
        dp=new int[max+1];


        for(int i=1; i<=N; i++){
            cost[i]=sc.nextInt();
            customer[i]=sc.nextInt();
            for(int j=cost[i]; j<=max; j++){
                //dp[3]=5->dp[4]=5->dp[5]=5->dp[6]=10
                dp[j]=Math.max(dp[j],dp[j-cost[i]]+customer[i]);
                if(dp[j]>=C){
                    break;
                }
            }
        }
        for(int i=1; i<=dp.length; i++){
            if(dp[i]>=C){
                System.out.println(i);
                break;

            }
        }


    }
}
