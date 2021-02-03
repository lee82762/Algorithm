package 연습문제.럭키스트레이트;

import java.util.Scanner;

public class Main {
    static  int N;
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        N=sc.nextInt();

        String s=Integer.toString(N);
        int len=s.length()/2;
        String s1=s.substring(0,len);
        String s2=s.substring(len,s.length());
        String re[]=s1.split("");
        String re1[]=s2.split("");
        int an1=0;
        int an2=0;
        for(int i=0; i<re.length; i++){
            an1+=Integer.parseInt(re[i]);
        }
        for(int i=0; i<re1.length; i++){
            an2+=Integer.parseInt(re1[i]);
        }
        if(an1==an2){
            System.out.println("LUCKY");
        }
        else{
            System.out.println("READY");
        }



    }
}