package 문자열.문자열집합;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static int N;
    static int M;
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        N=sc.nextInt();
        M=sc.nextInt();

        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0; i<N; i++){
            String s=sc.next();
            map.put(s,0);
        }

        for(int i=0; i<M; i++){
            String s=sc.next();
            if(map.containsKey(s)) {
                map.put(s, map.getOrDefault(s,0)+1);
            }
        }

        ArrayList<Integer>a1=new ArrayList<>(map.values());
        int answer=0;
        for(int i=0; i<a1.size(); i++){
            answer+=a1.get(i);
        }

        System.out.println(answer);



    }

}
