package 문자열.동일한단어그룹화하기;

import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        ArrayList<String>a1=new ArrayList<>();
        for(int i=0; i<a; i++){
            String s=sc.next();
            String s1[]=s.split("");
            Arrays.sort(s1);
            String re="";
            for(int j=0; j<s1.length; j++){
                re+=s1[j];
            }
            if(!a1.contains(re)) {
                a1.add(re);
            }

        }
        System.out.println(a1.size());
    }
}
