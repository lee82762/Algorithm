package 문자열.팰린드롬수;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true) {
            String s = sc.next();
            if(s.equals("0")){
                break;
            }
            String[] s1 = s.split("");
            int j = s.length() - 1;
            boolean check = true;
            for (int i = 0; i < s1.length; i++) {
                if (s1[i].equals(s1[j])) {
                    j--;
                    continue;
                } else if (i == j) {
                    break;
                } else {
                    check = false;
                    break;
                }
            }
            if (check == true) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }



    }
}