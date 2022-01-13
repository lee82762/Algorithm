package 정렬.안테나;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static  int N;
    static int arr[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        arr=new int[N];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        if(arr.length%2==0) {
            System.out.println(arr[(arr.length / 2) - 1]);
        }
        else{
            System.out.println(arr[(arr.length / 2) ]);
        }


    }
}
