package 슬라이딩윈도우.꿀아르바이트;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        long sum=0;
        long max=0;
        int window = K;

        int arr[]=new int[N];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0; i<arr.length; i++){
            if(i>=window){
                sum -= arr[i-window];
            }
            sum+=arr[i];
            max=Math.max(max,sum);
        }
        System.out.println(max);

    }
}

