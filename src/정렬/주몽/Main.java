package 정렬.주몽;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    static  int arr[];
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        arr=new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int answer=0;
        int i=0;
        int j=arr.length-1;

        
        while (i<j){
            if(arr[i]+arr[j]<M){
                i++;
            }
            else if(arr[i]+arr[j]>M){
                j--;
            }
            else if(arr[i]+arr[j]==M){
                i++;
                answer++;
                j--;
            }
        }

        System.out.println(answer);




    }
}