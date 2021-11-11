package DP.병사배치하기;

import java.util.*;

public class Main {
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        int arr1[]=new int[N];
        int cnt=arr.length-1;
        for(int i=0; i<arr.length; i++){
            arr1[i]=arr[cnt--];
        }
        int dp[]=new int[N];
        for(int i=0; i<N; i++){
            dp[i]=1;
            for(int j=0; j<i; j++){
                if(arr1[j]<arr1[i] && dp[i]<dp[j]+1){
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
