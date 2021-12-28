package 이분탐색.공유기설치;

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

        int first=1;

        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int last=arr[N-1]-arr[0]+1;

        while (first<last){
            int mid=(first+last)/2;
            if(check(mid)<M){
                last=mid;
            }
            else{

                first=mid+1;
            }

        }
        System.out.println(last-1);

    }
    static public int check(int mid){
        int cnt=1;
        int location=arr[0];
        for(int i=1; i<arr.length; i++){

            if(arr[i]-location>=mid){
                cnt++;
                location=arr[i];
            }
        }

        return cnt;
    }
}
