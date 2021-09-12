package 브루트포스.수이어가기;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Integer>a1;
    static int N,max;
    public static void main(String argp[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();

        for(int i=N/2; i<=N; i++){
            dfs(i);
        }
        System.out.println(max);
        for(int i=0; i<a1.size(); i++){
            System.out.print(a1.get(i)+" ");
        }

    }
    public static void dfs(int i){
        ArrayList<Integer>a2=new ArrayList<>();
        a2.add(N);
        a2.add(i);
        while (true){
            int pre=a2.get(a2.size()-2);
            int now=a2.get(a2.size()-1);
            int tm=pre-now;

            if(tm<0){
                break;
            }
            else{
                a2.add(tm);
            }
        }
        if(max<a2.size()){
            a1=new ArrayList<>();
            for(int j=0; j<a2.size(); j++){
                a1.add(a2.get(j));
            }
            max=a2.size();
        }


    }

}