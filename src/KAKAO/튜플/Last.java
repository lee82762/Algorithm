package KAKAO.튜플;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
class Last {
    public int[] solution(String s1) {

        s1=s1.replace("{{","");
        s1=s1.replace("}}","");
        s1=s1.replace("},{", " ");
        String temp[]=s1.split(" ");
        Arrays.sort(temp, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length()-o2.length();
            }
        });

        ArrayList<Integer> ans =new ArrayList<>();
        HashSet<Integer> set =new HashSet<>();
        for(String s : temp){
            String  a[]=s.split(",");
            for(int i=0; i<a.length; i++){
                int a1=Integer.parseInt(a[i]);
                if(set.isEmpty()){
                    set.add(a1);
                    ans.add(a1);
                }
                else{
                    if(!set.contains(a1)){
                        set.add(a1);
                        ans.add(a1);
                    }
                }
            }
        }
        int answer[]=new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            answer[i]=ans.get(i);
        }
        return answer;

    }
}