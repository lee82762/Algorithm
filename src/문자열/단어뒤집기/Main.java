package 문자열.단어뒤집기;

import java.util.Scanner;

public class Main {


    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);

        int N = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < N; i++) {
            String s = sc.nextLine();
            StringBuilder sb=new StringBuilder();

            String s1[]=s.split(" ");

            for(int j=0; j<s1.length; j++){
                String []s2=s1[j].split("");
                String temp="";

                for(int k=s2.length-1; k>=0; k--){
                    sb.append(s2[k]);
                }
                sb.append(" ");

            }
            System.out.println(sb.substring(0,sb.length()-1));


        }
    }
}
