package 이분탐색.숫자카드2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        int M=sc.nextInt();
        int arr1[]=new int[M];
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<M; i++){
            int k=sc.nextInt();
            sb.append(check1(arr,k)-check(arr,k)+" ");
        }
        System.out.println(sb);
    }
    static public int check(int []arr, int k){
        int first=0;
        int last=arr.length;

        while (first<last){
            int mid=(first+last)/2;
            if(k<=arr[mid]){
                last=mid;
            }
            else{
                first=mid+1;
            }
        }
        return first;
    }
    static public int check1(int []arr, int k){
        int first=0;
        int last=arr.length;

        while (first<last){
            int mid=(first+last)/2;
            if(k<arr[mid]){
                last=mid;
            }
            else{
                first=mid+1;
            }
        }
        return first;
    }
}
