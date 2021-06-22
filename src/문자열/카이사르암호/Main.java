package 문자열.카이사르암호;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,String>map=new HashMap<>();
        char c=65;
        char c1=68;
        for(int i=0; i<26; i++){
            String s=String.valueOf(c);
            String s1=String.valueOf(c1);
            map.put(s1,s);
            c++;
            c1++;
            if(c1==91){
                c1=65;
            }
        }
        String answer="";
        String s=sc.next();
        for(int i=0; i<s.length(); i++){
            char c2=s.charAt(i);
            String s3=String.valueOf(c2);
            answer+=map.get(s3);

        }
        System.out.println(answer);


    }

}
