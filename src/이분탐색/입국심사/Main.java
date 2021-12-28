package 이분탐색.입국심사;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int arr[];
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        arr=new int[N];
        Arrays.sort(arr);
        long first=1;
        long last=0;
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
            last=Math.max(last,arr[i]);
        }
        last=last*M;
        long answer=0;
        while (first<=last){
            long mid=(first+last)/2;
            long sum=0;
            for(int i=0; i<arr.length; i++){
                sum+=mid/arr[i];
            }
            if(sum<M){
                first=mid+1;
            }
            else{
                if(mid<answer){
                    answer=mid;
                }
                last=mid-1;
                answer=Math.max(answer,mid);
            }
        }
        System.out.println(answer);
    }
}
