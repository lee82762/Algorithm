package 연습문제.삼의배수;

import java.util.Scanner;

public class Main {

    static  String T;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        T=sc.next();
        int cnt=0;
        if(T.length()==1){
            System.out.println(cnt);
            if(Integer.parseInt(T)%3==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        else {

            while (true) {
                if (T.length() == 1) {
                    break;
                }
                String s1[] = T.split("");
                cnt++;
                int sum = 0;
                for (int i = 0; i < s1.length; i++) {
                    sum += Integer.parseInt(s1[i]);
                }
                T = Integer.toString(sum);
            }


            System.out.println(cnt);
            if (Integer.parseInt(T) % 3 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }













    }
}
