package 이분탐색.랜선자르기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        long arr[]=new long[N];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextLong();
        }

        long first=1;
        Arrays.sort(arr);
        long last=arr[N-1];

        long answer=0;
        while (first<=last){
            long mid=(first+last)/2;
            if(check(mid,M,arr)){
                answer=mid;
                first=mid+1;
            }
            else{
                last=mid-1;
            }

        }
        System.out.println(answer);

    }
    static public boolean check(long mid,long M,long arr[]){
        long cnt=0;
        for(int i=0; i<arr.length; i++){
            cnt+=arr[i]/mid;
            if(cnt>=M){
                return true;
            }
        }
        return false;
    }
}