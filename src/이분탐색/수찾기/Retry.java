package 이분탐색.수찾기;

import java.util.Arrays;
import java.util.Scanner;

public class Retry {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];

        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        int M=sc.nextInt();
        for(int i=0; i<M; i++){
            int k=sc.nextInt();
            System.out.println(check(arr,k));

        }
    }
    static public int check(int []arr, int k){
        int first=0;
        int last=arr.length;

        while (first<last){
            int mid=(first+last)/2;

            if(k<arr[mid]){
                last=mid;
            }
            else {
                first=mid+1;
            }

            if(arr[mid]==k){
                return 1;
            }
        }
        return 0;
    }
}
