package 이분탐색.용돈관리;

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
        int first=1;
        int last=(int) 1e9;
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
            first=Math.max(first,arr[i]);
        }
        int answer=0;
        while (first<=last){
            int mid=(first+last)/2;
            if(check(mid)>M){
                first=mid+1;
            }
            else{
                answer=mid;
                last=mid-1;
            }
        }
        System.out.println(answer);

    }
    static public int check(int mid){
        int cnt=1;
        int remind=mid;
        for(int i=0; i<arr.length; i++){
            if(remind-arr[i]<0){
                remind=mid;
                cnt++;
            }
            remind-=arr[i];
        }
        return cnt;
    }
}
