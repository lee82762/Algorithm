package 그리디.한줄로서기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int N;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        int a[]=new int[N];
        for(int i=0; i<N; i++){
            a[i]=sc.nextInt();
        }
        ArrayList<Integer>a1=new ArrayList<>();
        for(int i=N-1; i>=0; i--){
            int a2=a[i];
            a1.add(a2,i+1);
        }

        for(int i=0; i<a1.size(); i++){
            System.out.print(a1.get(i)+" ");
        }

    }
}
