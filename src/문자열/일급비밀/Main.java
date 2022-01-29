package 문자열.일급비밀;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.nextLine();
            if(s.equals("END")){
                break;
            }

            String []s1=s.split(" ");
            StringBuilder sb=new StringBuilder();
            for(int i=s1.length-1; i>=0; i--){
                String s2[]=s1[i].split("");
                for(int j=s2.length-1; j>=0; j--){
                    sb.append(s2[j]);
                }
                sb.append(" ");
            }
            System.out.println(sb.toString());


        }


    }
}
