package 문자열.민균이의비밀번호;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String arg[]) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();



        ArrayList<String >s1=new ArrayList<>();

        for(int i=0; i<N; i++){
            String s=sc.next();
            String  rs=new StringBuffer(s).reverse().toString();

            if(rs.equals(s) || s1.contains(rs)){
                System.out.println(s.length()+" "+s.charAt(s.length()/2));

            }
            else{
                s1.add(s);
            }


        }


    }
}
