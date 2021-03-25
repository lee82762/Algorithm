package 플로이드와샬.택배;

import java.util.Arrays;
import java.util.Scanner;

//알고리즘 원리 파악하기
public class Main {
    static int n;
    static int m;
    static int dp[][];
    static int dp1[][];
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        dp=new int[n+1][n+1];
        dp1=new int[n+1][n+1];


        for (int i = 1; i < n+1; i++) {
            Arrays.fill(dp[i], 10001);
            dp[i][i]=0;
        }


        for(int i=0; i<m; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();

            dp[a][b]=c;
            dp[b][a]=c;

            dp1[a][b]=b;
            dp1[b][a]=a;
        }

        for(int k=1; k<=n; k++){
            for(int i=1; i<=n; i++){
                for(int j=1; j<=n; j++){
                    if(dp[i][j]>dp[i][k]+dp[k][j]){
                        dp[i][j]=dp[i][k]+dp[k][j];

                        dp1[i][j]=dp1[i][k];

                    }
                }
            }
        }





        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==j){
                    System.out.print("-"+" ");
                }
                else{
                    System.out.print(dp1[i][j]+" ");
                }
            }
            System.out.println(" ");
        }








    }
}
