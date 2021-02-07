package 정렬.단어순서뒤집기;

import java.util.Scanner;

public class Main {
    static  int N;

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        System.out.println(s);
        String []st=s.split(" ");
        for(int i=st.length-1; i>=0; i--){
            System.out.print(st[i]+" ");
        }


    }
}
