package 이분탐색.과자나눠주기;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int arr[]=new int[M];
        int last=0;
        for(int i=0; i<M; i++){
            arr[i]=sc.nextInt();
            last=Math.max(last,arr[i]);
        }

        int first=1;
        Arrays.sort(arr);
        int answer=0;
        while (first<=last){
            int mid=(first+last)/2;
            if(check(mid,N,arr)){
                answer=mid;
                first=mid+1;
            }
            else{
                last=mid-1;
            }
        }
        System.out.println(answer);
    }
    static public boolean check(int mid,int N,int arr[]){
        int cnt=0;
        for(int i=0; i<arr.length; i++){
            cnt+=arr[i]/mid;
            if(cnt>=N){
                return true;
            }
        }
        return false;
    }
}
