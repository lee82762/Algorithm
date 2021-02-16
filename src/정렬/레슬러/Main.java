package 정렬.레슬러;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static int N;
    static int a[];
    static int b[];
    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);

        N=sc.nextInt();
        a=new int[10001];
        b=new int[10001];
        for(int i=0; i<N; i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }

        int answer=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0; i<N; i++){
            answer=0;
            int re=0;
            int re1=0;
            for(int j=0; j<N; j++){
                if(i==j){
                    continue;
                }
                re=a[i]+(b[i]*a[j]);
                re1=a[j]+(b[j]*a[i]);

                if(re>re1){
                    answer++;
                }
            }
            map.put(answer,i+1);
        }

        ArrayList<Integer>a1=new ArrayList<>(map.keySet());
        Collections.sort(a1,Collections.reverseOrder());

        for(int i=0; i<a1.size(); i++){
            System.out.println(map.get(a1.get(i)));
        }



    }
}
