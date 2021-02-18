package 정렬.수열정렬;

import java.util.Arrays;
import java.util.Scanner;



public class Main {
    static int N;
    static int P[];
    static int A[];
    static int B[];

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        A=new int[51];
        B=new int[51];
        P=new int[N];
        boolean visit[]=new boolean[51];

        for(int i=0; i<N; i++){
            A[i]=sc.nextInt();
        }

        for(int i=0; i<N; i++){
            P[i]=A[i];
        }
        Arrays.sort(P);

        for(int i=0; i<N; i++){
            for(int j=0; j<N; j++){
                if(A[i]==P[j]&&visit[j]==false){
                    visit[j]=true;
                    B[i]=j;
                    break;
                }
            }
        }

        for(int i=0; i<N; i++){
            System.out.print(B[i]+" ");
        }

    }
}
