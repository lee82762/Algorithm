package 이분탐색.듣보잡;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static int N;
    static  int M;
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();
        HashMap<String,Integer>map=new HashMap<>();


        for(int i=0; i<N+M; i++){
            String s=sc.next();
            map.put(s,map.getOrDefault(s,0)+1);
        }
        ArrayList<String>s2=new ArrayList<>(map.keySet());
        Collections.sort(s2,(o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        ArrayList<String>s1=new ArrayList<>();
        for(int i=0; i<s2.size(); i++){
            int re=map.get(s2.get(i));
            if(re>1){
                s1.add(s2.get(i));
            }
            else{
                break;
            }
        }
        System.out.println(s1.size());
        Collections.sort(s1);
        for(int i=0; i<s1.size(); i++){
            System.out.println(s1.get(i));
        }





    }

}
