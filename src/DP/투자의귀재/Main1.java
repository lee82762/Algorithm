package DP.투자의귀재;

//점화식으로 문제 해결 코드

import java.util.Scanner;

public class Main1 {
    static int H;
    static  int Y;
    static  int dp[];

    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        H=sc.nextInt();
        Y=sc.nextInt();
        dp=new int[11];
        dp[0]=H;

        for(int i=1; i<=Y; i++){
            dp[i]=(int)(dp[i-1]*0.05)+(int)dp[i-1];
            if(i>=3){
                dp[i]=Math.max((int)(dp[i-3]*1.2),dp[i]);
            }
            if(i>=5){
                dp[i]=Math.max((int)(dp[i-5]*1.35),dp[i]);
            }

        }
        System.out.println(dp[Y]);


    }
}
