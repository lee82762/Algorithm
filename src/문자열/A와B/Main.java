package 문자열.A와B;

import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        String T = sc.next();
        StringBuilder sb=new StringBuilder();
        sb.append(T);
        while (sb.length() != S.length()){
            String s=sb.toString();
            if(s.charAt(sb.length()-1)=='A'){
                sb.deleteCharAt(sb.length()-1);
            }
            else {
                sb.deleteCharAt(sb.length()-1);
                sb.reverse();
            }

        }
        if(sb.toString().equals(S)){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }

    }
}
