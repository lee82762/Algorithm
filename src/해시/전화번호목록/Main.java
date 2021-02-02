package 해시.전화번호목록;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static int T;
    static int N;
    static String[]phone;

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        T=sc.nextInt();
        for(int i=0; i<T; i++){
            N=sc.nextInt();
            phone=new String[N];
            for(int j=0; j<N; j++){
                phone[j]=sc.next();
            }

            Arrays.sort(phone);
            boolean answer=true;


            for(int k=0; k<phone.length-1; k++){
                if(phone[k].length()<phone[k+1].length()){
                    if(phone[k].substring(0,phone[k].length()).equals(phone[k+1].substring(0,phone[k].length()))){
                        System.out.println("NO");
                        answer=false;
                        break;
                    }
                }
                else{
                    if(phone[k+1].substring(0,phone[k+1].length()).equals(phone[k].substring(0,phone[k+1].length()))){
                        System.out.println("NO");
                        answer=false;
                        break;
                    }
                }
            }

            if(answer==true){
                System.out.println("YES");
            }

        }


    }

}