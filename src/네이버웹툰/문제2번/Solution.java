package 네이버웹툰.문제2번;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
class Solution {
    public String[] solution(String s) {
        int j=s.length();
        ArrayList<String>s1=new ArrayList<>();
        Deque<String> s2 = new ArrayDeque<String>();
        String tm="";
        String tm1="";
        int cnt=0;
        int cnt1=0;
        for(int i=0; i<s.length(); i++){
            if(i==j){
                if(!tm.equals(tm1)){
                    s1.add(tm+tm1);
                }
                break;
            }
            j--;
            if(s1.isEmpty()) {
                tm = s.substring(0, i + 1);
                tm1 = s.substring(j, s.length());
                if (tm.equals(tm1)) {
                    s1.add(tm);
                    s2.addFirst(tm1);
                    cnt=i;
                    cnt1=j;
                }
            }
            else {
                tm=s.substring(cnt+1,i+1);

                tm1=s.substring(j,cnt1);


                if(tm.equals(tm1)){
                    s1.add(tm);
                    s2.addFirst(tm1);
                    cnt=i;
                    cnt1=j;
                }
            }
        }
        while (!s2.isEmpty()){
            s1.add(s2.removeFirst());
        }
        String answer[]=new String[s1.size()];
        for(int i=0; i<s1.size(); i++){
            answer[i]=s1.get(i);
        }
        return answer;
    }
}
