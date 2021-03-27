package 플로이드와샬.보안시스템설치;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int n;
    static int m;
    static int dp[][];

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        dp=new int[n+1][n+1];
        for(int t[]:dp){
            Arrays.fill(t,100000000);
        }

        for(int i=0; i<m; i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            dp[a][b]=c;
            dp[b][a]=c;
        }
        for(int k=1; k<=n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if(i==j){
                        dp[i][j]=0;
                    }
                    else{
                        dp[i][j]=Math.min(dp[i][j],dp[i][k]+dp[k][j]);
                    }

                }
            }
        }



        int answer=0;
        int result=0;
        double min=100000000;
        double min1=0.0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                answer+=dp[i][j];
            }


            min1=(double)answer/n;
            if(min>min1){
                min=min1;
                result=i;
            }
            answer=0;

        }
        System.out.println(result);









    }
}
