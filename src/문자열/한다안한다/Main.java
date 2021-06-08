package 문자열.한다안한다;

import java.util.Scanner;

public class Main {
    static int T;
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();

        for(int i=0; i<T; i++){
            String s=sc.next();
            int n=s.length()/2;
            if(s.charAt(n-1)==s.charAt(n)){
                System.out.println("Do-it");
            }
            else{
                System.out.println("Do-it-Not");
            }
        }


    }

}
