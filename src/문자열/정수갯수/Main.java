package 문자열.정수갯수;

import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String arg[])throws IOException {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String arr[]=str.split(",");
        int answer=0;


        for(int i=0; i<arr.length; i++){
            boolean check=true;
            for(int j=0; j<arr[i].length(); j++){
                char c=arr[i].charAt(j);
                if(!Character.isDigit(c)){
                    check=false;
                    break;
                }

            }
            if(check==true){
                answer++;
            }

        }
        System.out.println(answer);








    }

}
