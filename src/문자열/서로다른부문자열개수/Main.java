package 문자열.서로다른부문자열개수;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();

        HashSet<String>set=new HashSet<>();
        for(int j=0; j<s.length(); j++) {
            int cnt = 1+j;
            for (int i = 0; i < s.length(); i++) {
                int cnt1 = i + cnt;
                String re = s.substring(i, cnt1);
                set.add(re);
                if (cnt1 == s.length()) {
                    break;
                }

            }
        }
        System.out.println(set.size());



    }
}
