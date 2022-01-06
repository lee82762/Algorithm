package 문자열.덩치;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int a[][]=new int[N][2];

        for(int i=0; i<N; i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            a[i][0]=x;
            a[i][1]=y;
        }
        int answer[]=new int[N];
        Arrays.fill(answer,1);
        for(int i=0; i<a.length; i++){
            int x=a[i][0];
            int y=a[i][1];
            for(int j=0; j<a.length; j++){
                if(i==j) continue;
                int x1=a[j][0];
                int y1=a[j][1];
                if(x1>x && y1>y){
                    answer[i]++;
                }
            }
        }
        for(int i=0; i<answer.length; i++){
            System.out.print(answer[i]+" ");
        }



    }
}
