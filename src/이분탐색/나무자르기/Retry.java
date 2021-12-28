package 이분탐색.나무자르기;

import java.util.Scanner;

public class Retry {
    static int N;
    static int M;
    static int arr[];
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        arr=new int[N];
        long first=1;
        long last=0;
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
            last=Math.max(last,arr[i]);
        }


        while (first<=last){

            long mid=(first+last)/2;
            long sum=0;
            for(int i=0; i<N; i++){
                if(arr[i]>mid)
                    sum+=arr[i]-mid;
            }
            if(sum>=M){
                first=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        System.out.println(last);
    }
}
