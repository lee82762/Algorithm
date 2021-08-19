package 문자열.rearrangewordsinasentence;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Solution {
    public String arrangeWords(String text) {
        String s1[]=text.split(" ");
        ArrayList<String> a1=new ArrayList<>();
        for(int i=0; i<s1.length; i++){
            s1[i]=s1[i].toLowerCase();
            int a=s1[i].length();
            a1.add(s1[i]+" "+Integer.toString(a));
        }
        Collections.sort(a1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String s1[]=o1.split(" ");
                String s2[]=o2.split(" ");
                return Integer.parseInt(s1[1])-Integer.parseInt(s2[1]);
            }
        });
        String answer="";
        for(int i=0; i<a1.size(); i++){

            String s3[]=a1.get(i).split(" ");
            answer+=(s3[0]+" ");
        }
        char []arr=answer.toCharArray();
        arr[0]=Character.toUpperCase(arr[0]);
        String a="";
        a=new String(arr);
        a=a.substring(0,a.length()-1);
        return a;
    }
}