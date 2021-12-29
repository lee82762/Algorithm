package 이분탐색.휴게소세우기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int K;
    static int arr[];
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        K=sc.nextInt();
        arr=new int[N+2];
        arr[0]=0;
        arr[arr.length-1]=K;
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int first=1;
        int last=K;
        while (first<=last) {
            int mid=(first+last)/2;

            if(check(mid)){
                first=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        System.out.println(first);
    }
    static public boolean check(int mid){
        int cnt=0;
        for(int i=1; i<arr.length; i++){
            cnt+=(arr[i]-arr[i-1]-1)/mid;
        }
        if(cnt>M){
            return true;
        }
        return false;
    }
}
