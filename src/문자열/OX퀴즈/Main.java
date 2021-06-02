package 문자열.OX퀴즈;

import java.util.Scanner;

public class Main {
    static int M;
    static String N;
    static int dp[];
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        M=sc.nextInt();
        for(int j=0; j<M; j++) {
            N = sc.next();

            dp = new int[N.length()];
            char c1 = N.charAt(0);
            if (c1 == 'O') {
                dp[0] += 1;
            }

            for (int i = 1; i < N.length(); i++) {
                char c = N.charAt(i);
                if (c == 'O') {
                    dp[i] = dp[i - 1] + 1;
                }

            }
            int answer = 0;
            for (int i = 0; i < dp.length; i++) {
                answer += dp[i];
            }
            System.out.println(answer);
        }



    }
}