package 이분탐색.보석상자;

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
        arr=new int[M];
        int first=1;
        int last=0;
        for(int i=0; i<M; i++){
            arr[i]=sc.nextInt();
            last=Math.max(last,arr[i]);
        }
        Arrays.sort(arr);
        int answer=0;
        while (first<=last){
            int mid=(first+last)/2;
            if(check(mid)){
                first=mid+1;
            }
            else{
                answer=mid;
                last=mid-1;
            }

        }
        System.out.println(answer);



    }
    static public boolean check(int mid){
        int cnt=0;
        for(int i=0; i<arr.length; i++){
            cnt+=arr[i]/mid;
            if(arr[i]%mid!=0){
                cnt++;
            }
        }
        if(cnt>N){
            return true;
        }
        return false;
    }

}
