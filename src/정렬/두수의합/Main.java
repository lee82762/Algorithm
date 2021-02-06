package 정렬.두수의합;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static  int N;
    static  int X;
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        int []arr=new int[N];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        X=sc.nextInt();

        int i=0;
        int j=arr.length-1;
        int cnt=0;
        while (i!=j){
            if(arr[j]+arr[i]==X){
                cnt++;
                i++;
            }
            else if(arr[j]+arr[i]>X){
                j--;
            }
            else{
                i++;
            }

        }

        System.out.println(cnt);

    }
}
