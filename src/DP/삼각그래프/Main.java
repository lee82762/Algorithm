package DP.삼각그래프;


import java.util.Scanner;

public class Main{
    static int N,N1;
    static int[][]map;
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        N=sc.nextInt();
        map=new int[N][3];
        for(int i=0; i<N; i++){
            for(int j=0; j<3; j++){
                map[i][j]=sc.nextInt();
            }
        }
        N1=sc.nextInt();

        for(int i=1; i<N; i++){
            for(int j=0; j<3; j++){
                if(i==1){
                    map[i][j]+=map[0][1];
                }
                else {
                    if (j == 0) {
                        map[i][j] = Math.min(map[i][j] + map[i - 1][j], map[i][j] + map[i - 1][j + 1]);
                    }
                    if (j == 1) {
                        map[i][j] = Math.min(Math.min(map[i][j] + map[i - 1][j], Math.min(map[i][j] + map[i - 1][j + 1], map[i][j] + map[i - 1][j - 1])), map[i][j] + map[i][j - 1]);
                    }
                    if (j == 2) {
                        map[i][j] = Math.min(map[i][j] + map[i][j - 1], Math.min(map[i][j] + map[i - 1][j - 1], map[i][j] + map[i - 1][j]));

                    }
                }
            }
        }
        System.out.println("1. "+map[N-1][1]);





    }

}




