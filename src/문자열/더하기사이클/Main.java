package 문자열.더하기사이클;

import java.util.Scanner;

public class Main {


    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        String N=sc.next();
        if(N.length()==1){
            N="0"+N;
        }
        String s1[]=N.split("");
        int answer=0;
        while (true){
            String s="";
            int a=0;
            a=Integer.parseInt(s1[0])+Integer.parseInt(s1[1]);
            String s2[]=Integer.toString(a).split("");
            String a1=s2[s2.length-1];
            s=s1[1]+a1;
            answer++;
            if(N.equals(s)){
                break;
            }
            s1[0]=s1[1];
            s1[1]=a1;
        }
        System.out.println(answer);

    }
}
