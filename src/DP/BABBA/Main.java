package DP.BABBA;

import java.util.Scanner;

public class Main {
    static int N;
    static int []A;
    static int []B;

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        A=new int[46];
        B=new int[47];

        A[0]=1;
        B[0]=0;

        for(int i=1; i<=N; i++){
            A[i]=B[i-1];
            B[i]=A[i-1]+A[i];
        }
        System.out.println(A[N]+" "+B[N]);

    }

}