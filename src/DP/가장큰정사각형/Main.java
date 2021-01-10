package DP.가장큰정사각형;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int [][]board1=new int[n][m];
        for(int i=0; i<n; i++){
            String s=sc.next();
            for(int j=0; j<m; j++){
                board1[i][j]=s.charAt(j)-48;
            }
        }
        for(int i=1; i<board1.length; i++){
            for(int j=1; j<board1[0].length; j++){
                if(board1[i][j]==0){
                    continue;
                }
                board1[i][j]=Math.min(board1[i-1][j],Math.min(board1[i][j-1],board1[i-1][j-1]))+1;
            }
        }
        int answer=0;
        for(int i=0; i<board1.length; i++){
            for(int j=0; j<board1[0].length; j++){
                answer=Math.max(answer,board1[i][j]);
            }
        }
        System.out.println(answer*answer);

    }
}
