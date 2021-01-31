package 이분탐색.수들의합;

import java.util.Scanner;

public class Main {
    static long N;
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextLong();
        long sum=0;
        long num=1;
        int cnt=0;
        while (true){
            sum+=num;
            num++;
            cnt++;
            if(sum>N){
                cnt--;
                break;
            }
        }
        System.out.println(cnt);


    }

}