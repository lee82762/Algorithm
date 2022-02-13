package 연습문제.약수;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[]=new int[N];
        for(int i=0; i<N; i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int answer=0;
        if(arr.length==1){
            answer=arr[0]*arr[0];
        }
        else{
            answer=arr[0]*arr[arr.length-1];
        }
        System.out.println(answer);
    }

}
