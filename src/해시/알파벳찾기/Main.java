package 해시.알파벳찾기;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        HashMap<Character,Integer> map =new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i))!=null) continue;
            map.put(s.charAt(i),i);
        }
        char c='a';
        for(int i=0; i<26; i++){
            if(map.get(c)!=null){
                System.out.print(map.get(c)+" ");
            }
            else{
                System.out.print("-1 ");
            }
            c++;
        }

    }
}
