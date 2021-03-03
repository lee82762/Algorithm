package 연습문제.쉽게푸는문제;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static int  A;
    static  int B;
    static int dp[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt=1;
        A=sc.nextInt();
        B=sc.nextInt();
        ArrayList<Integer>a1=new ArrayList<>();
        while (true){
            for(int i=0; i<cnt; i++){
                a1.add(cnt);
                if(a1.size()==B){
                    break;
                }
            }
            cnt++;
            if(a1.size()==B){
                break;
            }

        }
        int answer=0;
        for(int i=A-1; i<a1.size(); i++){
            answer+=a1.get(i);
        }
        System.out.println(answer);



    }
}
