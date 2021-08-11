package 이분탐색.나무자르기;

import java.util.Scanner;


public class Main {
    static int N;
    static int M;
    static int tree[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        tree=new int[N];
        long max=0;
        for(int i=0; i<N; i++){
            int a=sc.nextInt();
            tree[i]=a;
            max=Math.max(max,a);
        }
        long start=0;
        long end=max;
        while (start<=end){
            long mid=(start+end)/2;
            long sum=0;
            for(int a : tree){
                if(a>mid) {
                    sum += (a - mid);
                }
            }

            if(sum>=M){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        System.out.println(end);

    }
}
