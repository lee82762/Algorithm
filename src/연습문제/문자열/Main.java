package 연습문제.문자열;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();


        int answer=A.length();
        for(int i=0; i<=B.length()-A.length(); i++){
            int cnt=0;
            for(int j=0; j<A.length(); j++){
                if(A.charAt(j)!=B.charAt(i+j)){
                    cnt++;
                }
            }
            answer= Math.min(answer,cnt);

        }
        System.out.println(answer);



    }
}
