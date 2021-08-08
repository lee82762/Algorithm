package 이분탐색.수찾기;

import java.util.Arrays;
import java.util.Scanner;

//텔레포트 정거장
public class Main {
    static int N;
    static int M;
    static int A[];
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        A=new int[N];
        for(int i=0; i<N; i++){
            int a=sc.nextInt();
            A[i]=a;
        }
        Arrays.sort(A);
        M=sc.nextInt();
        for(int i=0; i<M; i++){
            int a=sc.nextInt();
            System.out.println(binary(a));
        }


    }
    static public int binary(int key){
        int left=0;
        int right=A.length-1;

        while (left<=right) {
            int mid = (left + right) / 2;
            if(key==A[mid]){
                return 1;
            }

            if(key<A[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
            }

        }
        return 0;
    }
}
