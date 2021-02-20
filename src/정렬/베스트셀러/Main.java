package 정렬.베스트셀러;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
//해쉬맵으로 구현
public class Main{
    static int  N;


    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        HashMap<String,Integer>map=new HashMap<>();

        for(int i=0; i<N; i++){
            String s=sc.next();
            map.put(s,map.getOrDefault(s,0)+1);
        }

        ArrayList<String>a1=new ArrayList<>(map.keySet());
        Collections.sort(a1,(o1, o2) -> map.get(o2).compareTo(map.get(o1)));



        ArrayList<String>s1=new ArrayList<>();
        int max=map.get(a1.get(0));
        for(int i=0; i<map.size(); i++){
            if(max==map.get(a1.get(i))){
                s1.add(a1.get(i));
            }
        }
        Collections.sort(s1);
        System.out.println(s1.get(0));




    }
}
