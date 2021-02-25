package 그리디.잃어버린괄호;

import java.util.Scanner;

public class Main {
    static  String N;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.next();

        String re[]=N.split("-");

        for(int i=0; i<re.length; i++){
            if(re[i].contains("+")){
                re[i]=re[i].replace("+","/");
                String re1[]=re[i].split("/");
                int result=0;
                for(int j=0; j<re1.length; j++){
                    result+=Integer.parseInt(re1[j]);
                }
                re[i]=Integer.toString(result);
            }
        }
        int answer=Integer.parseInt(re[0]);

        for(int i=1; i<re.length; i++){
            answer-=Integer.parseInt(re[i]);
        }
        System.out.println(answer);

    }
}
