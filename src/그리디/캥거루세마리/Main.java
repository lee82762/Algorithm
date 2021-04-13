package 그리디.캥거루세마리;

import java.util.Scanner;


public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int A, B, C, temp;
        int answer,cnt = 0;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        answer = B - A > C - B ? B - A - 1 : C - B - 1;
        System.out.println(answer);



    }

}





