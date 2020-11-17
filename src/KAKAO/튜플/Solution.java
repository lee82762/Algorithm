package KAKAO.튜플;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public int[] solution(String s) {
        s=s.replace("},{","/");
        s=s.replace("{","");
        s=s.replace(","," ");
        s=s.replace("}","");

        ArrayList<String>st=new ArrayList<>();
        String s1[]=s.split("/");
        Arrays.sort(s1,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length())
                    return 1;
                else if (o1.length() < o2.length())
                    return -1;
                else {
                    return o1.compareTo(o2);
                }
            }
        });




        for(int i=0; i<s1.length; i++){
            if(s1[i].length()==1){
                st.add(s1[i]);
                continue;
            }
            String []s2=s1[i].split(" ");
            for(int j=0; j<s2.length; j++){
                if(!st.contains(s2[j])){
                    st.add(s2[j]);
                }
            }

        }
        int []answer=new int[st.size()];
        for(int i=0; i<st.size(); i++){
            answer[i]=Integer.parseInt(st.get(i));

        }
        return answer;

    }
}
