package 정렬.파일정리;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static  int N;

    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        String s[]=new String[N];
        for(int i=0; i<N; i++){
            s[i]=sc.next();

        }
        HashMap<String,Integer>map=new HashMap<>();
        for (int j=0; j<s.length; j++){
            int cnt=0;
            for(int i=0; i<s[j].length(); i++) {
                char c = s[j].charAt(i);
                if (c == '.') {
                    cnt = i;
                    break;
                }
            }
            String s2=s[j].substring(cnt+1,s[j].length());
            map.put(s2,map.getOrDefault(s2,0)+1);
        }
        ArrayList<String>st=new ArrayList<>(map.keySet());
        Collections.sort(st);
        for(int i=0; i<st.size(); i++){
            System.out.println(st.get(i)+" "+map.get(st.get(i)));
        }






    }
}
