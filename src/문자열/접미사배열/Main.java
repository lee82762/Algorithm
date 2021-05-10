package 문자열.접미사배열;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String argp[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        ArrayList<String >s1=new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            String temp=s.substring(i,s.length());

            s1.add(temp);
        }
        Collections.sort(s1);
        for(int i=0; i<s1.size(); i++){
            System.out.println(s1.get(i));
        }

    }
}
