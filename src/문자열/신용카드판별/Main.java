package 문자열.신용카드판별;

import java.util.Scanner;
public class Main{
    static int N;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        for(int i=0; i<N; i++) {
            String s = sc.next();
            int answer=0;
            for(int j=0; j<s.length(); j++){
                String tm=String.valueOf(s.charAt(j));
                if(j%2==0){
                    int re=Integer.parseInt(tm)*2;

                    if(re>=10){
                        String tm1=Integer.toString(re);
                        int re1=Integer.parseInt(String.valueOf(tm1.charAt(0)))+Integer.parseInt(String.valueOf(tm1.charAt(1)));
                        answer+=re1;
                    }
                    else{
                        answer+=re;
                    }
                }
                else{
                    answer+=Integer.parseInt(tm);
                }
            }
            if(answer%10==0){
                System.out.println("T");
            }
            else{
                System.out.println("F");
            }
        }




    }
}
