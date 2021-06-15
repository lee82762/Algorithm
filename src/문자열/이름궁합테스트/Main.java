package 문자열.이름궁합테스트;

import java.util.HashMap;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        String s=sc.next();
        String s1=sc.next();

        HashMap<String,Integer>map=new HashMap<>();
        map.put("A",3);
        map.put("B",2);
        map.put("C",1);
        map.put("D",2);
        map.put("E",4);
        map.put("F",3);
        map.put("G",1);
        map.put("H",3);
        map.put("I",1);
        map.put("J",1);
        map.put("K",3);
        map.put("L",1);
        map.put("M",3);
        map.put("N",2);
        map.put("O",1);
        map.put("P",2);
        map.put("Q",2);
        map.put("R",2);
        map.put("S",1);
        map.put("T",2);
        map.put("U",1);
        map.put("V",1);
        map.put("W",1);
        map.put("X",2);
        map.put("Y",2);
        map.put("Z",1);
        String an="";
        String []s2=s.split("");
        String []s3=s1.split("");
        int cnt=0;
        int cnt1=0;
        while (true){
            if(cnt==s2.length&&cnt1==s3.length){
                break;
            }
            if(cnt!=s2.length) {
                an += s2[cnt++];
            }
            if(cnt1!=s3.length) {
                an += s3[cnt1++];
            }
        }

        String anw[]=an.split("");

        String re1="";
        for(int i=0; i<anw.length; i++){
            String re=anw[i];
            re1+=Integer.toString(map.get(re));
        }


        while (true) {
            if(re1.length()==2){
                break;
            }
            String re3[] = re1.split("");
            String re4 = "";
            for (int i = 0; i < re1.length() - 1; i++) {
                int a = Integer.parseInt(re3[i]) + Integer.parseInt(re3[i + 1]);
                if (a >= 10) {
                    String tm = Integer.toString(a);
                    String tm1 = String.valueOf(tm.charAt(1));
                    re4 += tm1;
                } else {
                    String tm = Integer.toString(a);
                    re4 += tm;
                }
            }
            re1 = re4;
        }
        if(re1.charAt(0)=='0'){
            System.out.println(String.valueOf(re1.charAt(1))+"%");
        }
        else {
            System.out.println(re1+"%");
        }







    }
}
