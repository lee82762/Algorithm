package 위클리챌린지.사주차;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
class Solution {
    public String solution(String[] table, String[] languages, int[] preference) {
        HashMap<String,Integer>map1=new HashMap<>();
        for(int i=0; i<languages.length; i++){
            map1.put(languages[i],preference[i]);
        }
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0; i<table.length; i++){
            String s[]=table[i].split(" ");
            int result=0;
            int cnt=5;
            for(int j=1; j<s.length; j++){
                String temp=s[j];
                if(map1.containsKey(temp)){
                    result+=(map1.get(temp)*cnt);
                }
                cnt--;
            }
            map.put(s[0],result);
        }
        ArrayList<String>s1=new ArrayList<>(map.keySet());

        Collections.sort(s1, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(map.get(o1)==map.get(o2)){
                    return o1.compareTo(o2);
                }
                else{
                    return map.get(o2)-map.get(o1);
                }
            }
        });
        String answer="";
        answer=s1.get(0);
        return answer;
    }
}
