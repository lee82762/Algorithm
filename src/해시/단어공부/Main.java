package 해시.단어공부;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        s=s.toUpperCase();
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }

        ArrayList<Character> s1 =new ArrayList<>(map.keySet());


        int max=0;
        String answer="";

        for(int i=0; i<s1.size(); i++){
            char tm=s1.get(i);
            if(max==map.get(tm)){
                answer="?";
                continue;
            }
            else{
                max=Math.max(max,map.get(tm));
                if(max==map.get(tm)){
                    answer=String.valueOf(tm);
                }
            }

        }
        System.out.println(answer);

    }
}
