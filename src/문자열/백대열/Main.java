package 문자열.백대열;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        String []s1=s.split(":");

        int gcd1=gcd(Integer.parseInt(s1[0]),Integer.parseInt(s1[1]));

        int a=Integer.parseInt(s1[0])/gcd1;
        int b=Integer.parseInt(s1[1])/gcd1;
        String answer=Integer.toString(a)+":"+Integer.toString(b);
        System.out.println(answer);

    }
    static int gcd(int a,int b){
        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

}
