package 문자열.뒤집힌덧셈;

import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String X=sc.next();
        String Y=sc.next();

        X=rev(X);
        Y=rev(Y);
        String Z=Integer.toString(Integer.parseInt(X)+Integer.parseInt(Y));
        Z=rev(Z);
        System.out.println(Integer.parseInt(Z));

    }
    public static String rev(String s){
        String s1[]=s.split("");
        String answer="";
        for(int i=s1.length-1; i>=0; i--){
            answer+=s1[i];
        }
        return answer;
    }
}