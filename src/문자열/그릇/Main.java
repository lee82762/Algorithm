package 문자열.그릇;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int answer=0;

        for(int i=0; i<s.length(); i++){
            char c[]=s.toCharArray();
            if(i==0){
                answer+=10;
            }
            else {
                if(c[i]=='('&& c[i-1]=='('){
                    answer+=5;
                }
                else if(c[i]=='('&&c[i-1]==')'){
                    answer+=10;
                }
                else if(c[i]==')'&&c[i-1]=='('){
                    answer+=10;
                }
                else if(c[i]==')'&&c[i-1]==')'){
                    answer+=5;
                }
            }

        }
        System.out.println(answer);




    }
}