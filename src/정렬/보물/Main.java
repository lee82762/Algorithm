package 정렬.보물;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    static  int  N;
    static  int A[];
    static  Integer B[];
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        A=new int[N];
        B=new Integer[N];

        for(int i=0; i<N; i++){
            A[i]=sc.nextInt();
        }
        for(int i=0; i<N; i++){
            B[i]=sc.nextInt();
        }
        Arrays.sort(A);
        Arrays.sort(B, Comparator.reverseOrder());

        int answer=0;

        for(int i=0; i<N; i++){
            answer+=(A[i]*B[i]);
        }
        System.out.println(answer);



    }
}
