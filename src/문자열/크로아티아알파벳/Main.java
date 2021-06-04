package 문자열.크로아티아알파벳;

import java.util.Scanner;

public class Main {

    static int  N;
    static String arr[][];
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        if (s.contains("c=")) {
            s = s.replace("c=", " ");

        }
        if (s.contains("c-")) {
            s = s.replace("c-", " ");

        }
        if (s.contains("dz=")) {
            s = s.replace("dz=", " ");

        }
        if (s.contains("d-")) {
            s = s.replace("d-", " ");

        }
        if (s.contains("lj")) {
            s = s.replace("lj", " ");

        }
        if (s.contains("nj")) {
            s = s.replace("nj", " ");

        }
        if (s.contains("s=")) {
            s = s.replace("s=", " ");

        }
        if (s.contains("z=")) {
            s = s.replace("z=", " ");

        }
        System.out.println(s.length());




    }
}
