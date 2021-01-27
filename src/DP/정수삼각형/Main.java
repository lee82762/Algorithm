package DP.정수삼각형;

import java.util.Scanner;

public class Main {
    static int N;
    static int [][]map;
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();

        map=new int[N+1][N+1];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i + 1; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        for(int i=1; i<map.length; i++){
            for(int j=0; j<=i; j++){
                if(j==0){
                    map[i][j]+=map[i-1][j];
                }
                else if(j==i){
                    map[i][j]+=map[i-1][j-1];
                }
                else{
                    map[i][j]=Math.max(map[i][j]+map[i-1][j],map[i][j]+map[i-1][j-1]);
                }

            }
        }

        int answer=0;
        for(int i=N-1; i<N; i++){
            for(int j=0; j<N; j++){
                answer=Math.max(answer,map[i][j]);
            }
        }
        System.out.println(answer);




    }
}