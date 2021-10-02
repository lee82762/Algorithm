package 플로이드와샬.회장뽑기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int N;
    static int map[][];
    public static void main(String argp[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        map=new int[N+1][N+1];
        for(int []a:map){
            Arrays.fill(a,10000001);
        }
        while (true){
            int a=sc.nextInt();
            int b=sc.nextInt();
            if(a==-1&&b==-1){
                break;
            }
            map[a][b]=1;
            map[b][a]=1;
        }

        for(int k=1; k<=N; k++){
            for(int i=1; i<=N; i++){
                for(int j=1; j<=N; j++){
                    if(i==j){
                        continue;
                    }
                    else{
                        map[i][j]=Math.min(map[i][j],map[i][k]+map[k][j]);
                    }
                }
            }
        }
        int max=0;
        int min=10000001;
        for(int i=1; i<=N; i++){
            max=0;
            for(int j=1; j<=N; j++) {
                if (i == j) continue;
                else {
                    max = Math.max(max, map[i][j]);
                }
            }
            min=Math.min(min,max);
        }
        ArrayList<Integer>a1=new ArrayList<>();
        int max1=0;
        for(int i=1; i<=N; i++){
            max1=0;
            for(int j=1; j<=N; j++) {
                if (i == j) continue;
                else {
                    max1 = Math.max(max1, map[i][j]);
                }
            }
            if(min==max1){
                a1.add(i);
            }

        }
        System.out.println(min+" "+a1.size());
        for(int i=0; i<a1.size(); i++){
            if(i==a1.size()-1){
                System.out.print(a1.get(i));
            }
            else {
                System.out.print(a1.get(i) + " ");
            }
        }



    }
}
