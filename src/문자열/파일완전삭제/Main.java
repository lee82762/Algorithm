package 문자열.파일완전삭제;

import java.util.Scanner;
public class Main{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();

        String bit=sc.next();
        String rebit=sc.next();


        if(N%2==0){
            if(bit.equals(rebit)){

                System.out.println("Deletion succeeded");
            }
            else {
                System.out.println("Deletion failed");
            }
        }
        else{
            String answer="";
            for(int i=0; i<bit.length(); i++){
                char c=bit.charAt(i);
                if(c=='1'){

                    answer+="0";
                }
                else {

                    answer+="1";
                }

            }
            if(answer.equals(rebit)){
                System.out.println("Deletion succeeded");
            }
            else {
                System.out.println("Deletion failed");
            }

        }

    }
}