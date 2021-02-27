package 브루트포스.날짜계산;

import java.util.Scanner;

public class Main {

    static  int  E;
    static  int  S;
    static  int  M;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        E=sc.nextInt();
        S=sc.nextInt();
        M=sc.nextInt();

        int e = 1,s=1,m=1;
        int year=1;
        while (true){
            if(E==e&&S==s&&M==m){
                break;
            }
            e++;
            s++;
            m++;
            year++;
            if(e>15){
                e=1;
            }
            if(s>28){
                s=1;
            }
            if(m>19){
                m=1;
            }
        }
        System.out.println(year);


    }
}
