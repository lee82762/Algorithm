package 문자열.반지;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String re=sc.next();
        int n=sc.nextInt();
        int answer=0;
        for(int i=0; i<n; i++) {
            String s = sc.next();
            s=s+s;
            if(s.contains(re)){
                answer++;
            }
        }
        System.out.println(answer);


    }
}
