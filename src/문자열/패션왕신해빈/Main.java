package 문자열.패션왕신해빈;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String argp[]){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();

        for(int t=0; t<k; t++) {
            int n = sc.nextInt();
            HashMap<String, Integer> map = new HashMap<>();

            for (int i = 0; i < n; i++) {

                String s = sc.next();
                String s1 = sc.next();
                map.put(s1, map.getOrDefault(s1, 0) + 1);
            }

            ArrayList<String> s1 = new ArrayList<>(map.keySet());
            int answer = 1;
            for (int i = 0; i < s1.size(); i++) {
                answer *= map.get(s1.get(i)) + 1;
            }
            System.out.println(answer - 1);
        }

    }
}
