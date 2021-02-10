package DP.팰린드롬;


import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static  int N;
    static  int M;
    static  int  arr[];
    static  int  dp[][];
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        N=sc.nextInt();
        arr=new int[N+1];
        dp=new int[N+1][N+1];
        for(int i=1; i<=N; i++){
            arr[i]=sc.nextInt();
        }

        for (int[] arr : dp)
            Arrays.fill(arr, -1);

        M=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<M; i++){
            int s=sc.nextInt();
            int e=sc.nextInt();

            sb.append(palam(s,e)+"\n");

        }
        System.out.print(sb);

    }

    static int palam(int start, int end){

        if(dp[start][end]==-1) {
            if (start == end) {
                dp[start][end] = 1;
            } else if (start + 1 == end) {
                if (arr[start] == arr[end]) {
                    dp[start][end] = 1;
                } else {
                    dp[start][end] = 0;
                }

            } else if (arr[start] != arr[end]) {
                dp[start][end] = 0;
            } else {
                dp[start][end] = palam(start + 1, end - 1);
            }
        }


        return dp[start][end];
    }

}








