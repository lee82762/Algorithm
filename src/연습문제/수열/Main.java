package 연습문제.수열;

import java.util.Scanner;

public class Main {
    //정수의 최솟값을 초기값으로 둔다.
    static int max=Integer.MIN_VALUE;
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int []anw=new int[N];
        for(int i=0; i<N; i++){
            int c=sc.nextInt();
            anw[i]=c;
        }
        int cnt=N-K+1;

        for(int i=0; i<cnt; i++){
            int sum=0;
            for(int j=i; j<=i+(K-1); j++){
                sum+=anw[j];
            }
            max=Math.max(max,sum);
        }
        System.out.println(max);
    }

}
