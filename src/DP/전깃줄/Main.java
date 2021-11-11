package DP.전깃줄;

import java.util.*;

public class Main {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[][]=new int[N][2];
        for(int i=0; i<N; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            arr[i][0]=a;
            arr[i][1]=b;
        }
        int dp[]=new int[N];
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });
        for(int i=0; i<N; i++){
            dp[i]=1;

            for(int j=0; j<i; j++){
                if(arr[j][1]<arr[i][1] && dp[i]<dp[j]+1){
                    dp[i]=dp[j]+1;
                }
            }
        }
        int answer=0;
        for(int i=0; i<dp.length; i++){
            answer=Math.max(dp[i], answer);
        }
        System.out.println(N-answer);


    }
}
