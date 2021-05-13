package 문자열.문서검색;
import java.util.Scanner;

public class Main {
    static String s;
    static String s1;

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        s=sc.nextLine();
        s1=sc.nextLine();

        int answer=0;

        for(int i=0; i<s.length()-s1.length()+1; i++){
            if(s1.equals(s.substring(i,i+s1.length()))){
                answer++;
                i+=s1.length();
                i--;
            }
            else{
                continue;
            }

        }
        System.out.println(answer);



    }

}
