package 이분탐색.게임;

import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int arr[];
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        int a=check(N,M);


        int first=1;
        int last=(int) 1e9;
        int answer=-1;
        while (first<=last){
            int mid=(first+last)/2;

            if(check(N+mid,M+mid)!=a){
                answer=mid;
                last=mid-1;
            }
            else{
                first=mid+1;
            }
        }
        System.out.println(answer);


    }
    static public int check(int X, int Y){
        return (int) ((long) Y * 100 / X);
    }

}
