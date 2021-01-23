package DP.점프;

import java.util.Scanner;
//경로의 갯수 구한는문제는 dp를 사용하는 것이 시간 효율에 적절하다.
public class Main {
    static int [][]map;
    static long [][]dp;
    static int N;
    static int temp;
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        map=new int[N][N];
        dp=new long[N][N];
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                map[i][j]=sc.nextInt();
            }
        }
        dp[0][0]=1;
        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){

                //종료 조건
                if(i==N-1&&j==N-1){
                    System.out.println(dp[i][j]);
                }
                else {
                    //dp[i][j]가 0이 아닐떄
                    if(dp[i][j]>0){
                        temp=map[i][j];

                        //아래방향
                        if(i+temp<N){
                            dp[i+temp][j]=dp[i+temp][j]+dp[i][j];
                        }
                        //오른쪽 방향
                        if(j+temp<N){
                            dp[i][j+temp]=dp[i][j+temp]+dp[i][j];
                        }
                    }
                }
            }
        }




    }

}