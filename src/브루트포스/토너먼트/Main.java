package 브루트포스.토너먼트;

import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static int K;

    static int answer=0;
    public static void main(String argp[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        K=sc.nextInt();


        while (M!=K){
            M=M/2+M%2;
            K=K/2+K%2;
            answer++;
        }
        System.out.println(answer);

    }
}
