package 슬라이딩윈도우.블로그;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int arr[]=new int[N];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        long sum = 0;
        long max = 0;
        int time = 0;

        for(int i=0; i<arr.length; i++){
            if(i>=K){
                sum -= arr[i-K];
            }
            sum += arr[i];
            if(max<sum){
                max=sum;
                time=1;
            }
            else if(max==sum){
                time++;
            }
        }

        if(max==0){
            System.out.println("SAD");
            return;
        }
        System.out.println(max);
        System.out.println(time);

    }
}
