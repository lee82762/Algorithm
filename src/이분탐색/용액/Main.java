package 이분탐색.용액;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N;
    static int arr[];
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        arr=new int[N];
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int max=Integer.MAX_VALUE;
        int answer[]=new int[2];
        for(int i=0; i<N; i++){
            int start=i+1;
            int end=N-1;
            while (start<=end){
                int mid=(start+end)/2;
                int a=arr[i]+arr[mid];

                if(Math.abs(a)<max){
                    answer[0]=arr[i];
                    answer[1]=arr[mid];
                    max=Math.abs(a);
                }

                if(a<0){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
            }
        }
        System.out.println(answer[0]+" "+answer[1]);

    }
}
