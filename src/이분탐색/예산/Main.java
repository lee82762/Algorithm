package 이분탐색.예산;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N;
    static  int M;
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        int re[]=new int[N];
        int sum=0;
        for(int i=0; i<N; i++){
            re[i]=sc.nextInt();
            sum+=re[i];
        }
        M=sc.nextInt();
        Arrays.sort(re);

        int max=0;
        int current=0;
        int total=0;
        if(sum<=M){
            System.out.println(re[N-1]);
        }
        else{


            for(int i=0; i<N; i++){
                total=current+(re[i]*(N-i));

                if(total<M){
                    current+=re[i];

                    continue;
                }
                else{

                    max=(M-current)/(N-i);
                    System.out.println(max);
                    break;
                }

            }
        }







    }

}