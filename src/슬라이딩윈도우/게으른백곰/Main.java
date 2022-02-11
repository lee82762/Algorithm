package 슬라이딩윈도우.게으른백곰;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int arr[]=new int[1000001];
        for(int i=0; i<N; i++){
            int g=sc.nextInt();
            int x=sc.nextInt();
            arr[x]=g;
        }

        int max=0;
        int temp1=0;
        int window= 1 + (2*K);
        for(int i=0; i<arr.length; i++){
            if(i>=window){
                temp1 -= arr[i-window];
            }
            temp1 += arr[i];
            if(temp1>max ){
                max=temp1;
            }
        }
        System.out.println(max);
    }
}
