package 해시.포켓몬마스터;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    static int  A;
    static  int B;
    static int dp[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        A=sc.nextInt();
        B=sc.nextInt();
        HashMap<String,String>map=new HashMap<>();

        for(int i=0; i<A; i++){
            String s2=sc.next();

            map.put(s2,Integer.toString(i+1));
            map.put(Integer.toString(i+1),s2);
        }
        ArrayList<String>s3=new ArrayList<>();
        for(int i=0; i<B; i++){
            String s2=sc.next();
            s3.add(s2);
        }
        for(int i=0; i<s3.size(); i++){
            String s=s3.get(i);
            System.out.println(map.get(s));

        }



    }

}