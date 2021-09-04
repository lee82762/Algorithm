package 코딩테스트.새마을중앙일번;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        String order="qwertyuiopasdfghjklzxcvbnm";
        //String order="zyxwvutsrqponmlkjihgfedcba";
        //String words[]={"wow","we","have","to","sort","in","inverse","order"};
        String words[]={"c","cplusplus","csharp","java","javascript","python"};
        String orders[]=order.split("");
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0; i<26; i++){
            map.put(orders[i],i);
        }


        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String o1s[]=o1.split("");
                String o2s[]=o2.split("");
                if(o1s.length>o2.length()){


                    String s=o2.substring(0,o2.length());
                    String s1=o1.substring(0,o2.length());
                    if(s.equals(s1)){
                        return o1.compareTo(o2);
                    }
                    for(int i=0; i<o1s.length; i++){
                        if(map.get(o1s[i])==map.get(o2s[i])) {
                            continue;
                        }
                        else if(map.get(o1s[i])<map.get(o2s[i])) {

                            return  map.get(o1s[i]).compareTo(map.get(o2s[i]));
                        }
                        else{

                            return map.get(o1s[i]).compareTo(map.get(o2s[i]));
                        }
                    }
                }
                else{



                    String s=o2.substring(0,o1.length());
                    String s1=o1.substring(0,o1.length());
                    if(s.equals(s1)){
                        return o1.compareTo(o2);
                    }
                    for(int i=0; i<o1s.length; i++){
                        if(map.get(o1s[i])==map.get(o2s[i])) {
                            continue;
                        }
                        else if(map.get(o1s[i])<map.get(o2s[i])) {

                            return  map.get(o1s[i]).compareTo(map.get(o2s[i]));
                        }
                        else{
                            return map.get(o1s[i]).compareTo(map.get(o2s[i]));
                        }
                    }


                }
                return o2.compareTo(o1);
            }
        });
        System.out.println(Arrays.toString(words));



    }
}
