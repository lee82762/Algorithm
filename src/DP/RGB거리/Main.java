package DP.RGB거리;

import java.util.Scanner;

public class Main {
    static int N;
    static int [][]map;

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        map=new int[1001][1001];

        for(int i=0; i<N; i++){
            for(int j=0; j<3; j++){
                map[i][j]=sc.nextInt();
            }
        }

        for(int i=1; i<N; i++){
            for(int j=0; j<3; j++){
                if(j==0){
                    map[i][j]=Math.min(map[i][j]+map[i-1][j+1],map[i][j]+map[i-1][j+2]);

                }
                else if(j==1){
                    map[i][j]=Math.min(map[i][j]+map[i-1][j-1],map[i][j]+map[i-1][j+1]);

                }
                else{
                    map[i][j]=Math.min(map[i][j]+map[i-1][j-1],map[i][j]+map[i-1][j-2]);
                }
            }
        }


        System.out.println(Math.min(map[N-1][0], Math.min(map[N-1][1], map[N-1][2])));


    }

}
