package 정렬.먹을것인가먹힐것인가;

import java.util.*;

public class Main{
    static int T;
    static  int A;
    static  int B;
    static int a[];
    static int b[];

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();

        for(int i=0; i<T; i++){
            A=sc.nextInt();
            B=sc.nextInt();
            a=new int[A];
            b=new int[B];
            for(int j=0; j<A; j++){
                a[j]=sc.nextInt();
            }

            for(int j=0; j<B; j++){
                b[j]=sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b);
            int answer=0;


            for(int j=0;j<a.length; j++){
                for(int k=0; k<b.length; k++){
                    if(a[j]>b[k]){
                        answer++;
                    }
                    else{
                        break;
                    }
                }
            }
            System.out.println(answer);
        }


    }
}