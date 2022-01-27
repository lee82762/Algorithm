package DP.구간합구하기5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int arr[][]=new int[N+1][N+1];
        int sum[][]=new int[N+1][N+1];
        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                arr[i][j]=sc.nextInt();
            }
        }



        for(int i=1; i<=N; i++){
            for(int j=1; j<=N; j++){
                sum[i][j]=sum[i][j-1]+sum[i-1][j]-sum[i-1][j-1]+arr[i][j];
            }
        }


        StringBuilder sb=new StringBuilder();
        for(int i=0; i<M; i++){
            int x1=sc.nextInt();
            int y1=sc.nextInt();
            int x2=sc.nextInt();
            int y2=sc.nextInt();
            sb.append(sum[x2][y2]-sum[x2][y1-1]-sum[x1-1][y2]+sum[x1-1][y1-1]+"\n");
        }
        System.out.println(sb.toString());

    }
}
