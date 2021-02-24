package 정렬.생일;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static  int N;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        HashMap<String,Integer>map=new HashMap<>();

        for(int i=0; i<N; i++){
            String s=sc.next();
            String s1=sc.next();
            String s2=sc.next();
            String s3=sc.next();
            if(s1.length()==1){
                s1="0"+s1;
            }
            if(s2.length()==1){
                s2="0"+s2;
            }

            String result=s3+s2+s1;
            map.put(s,Integer.parseInt(result));
        }

        ArrayList<String>a1=new ArrayList<>(map.keySet());
        Collections.sort(a1,(o1, o2) -> map.get(o2).compareTo(map.get(o1)));

        System.out.println(a1.get(0));
        System.out.println(a1.get(N-1));


    }
}
