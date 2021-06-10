package 문자열.숫자의개수;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main{
    static int A;
    static int B;
    static int C;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        A=sc.nextInt();
        B=sc.nextInt();
        C=sc.nextInt();
        int re=A*B*C;

        String re1=Integer.toString(re);

        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0; i<=9; i++){
            map.put(Integer.toString(i),0);
        }

        for(int i=0; i<re1.length(); i++){
            char c=re1.charAt(i);

            map.put(String.valueOf(c),map.getOrDefault(String.valueOf(c),0)+1);
        }
        ArrayList<Integer>a1=new ArrayList<>(map.values());
        for(int i=0; i<a1.size(); i++){
            System.out.println(a1.get(i));
        }

        ;

    }
}
