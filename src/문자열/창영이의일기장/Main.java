package 문자열.창영이의일기장;

import java.util.Scanner;

public class Main {
    static int T;
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String s1[]=s.split(" ");

        String answer="";
        for(int i=0; i<s1.length; i++){
            String tm=s1[i];
            for(int j=0; j<tm.length(); j++){
                char c=tm.charAt(j);
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                    answer+=c;
                    j+=2;
                }
                else{
                    answer+=c;
                }
            }
            answer+=" ";
        }
        System.out.println(answer);


    }

}
