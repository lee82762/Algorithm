package 해시.첼시를도와줘;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    static int N;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        for(int k=0; k<N; k++) {
            int P = sc.nextInt();
            HashMap<String, Integer> map = new HashMap<>();
            for (int i = 0; i < P; i++) {
                int won = sc.nextInt();
                String name = sc.next();
                map.put(name, won);
            }
            ArrayList<String> a1 = new ArrayList<>(map.keySet());
            Collections.sort(a1, (o1, o2) -> map.get(o2).compareTo(map.get(o1)));
            System.out.println(a1.get(0));
        }
    }
}