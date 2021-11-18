package KAKAO.압축3차;

import java.util.ArrayList;
import java.util.HashMap;

class Retry1 {
    public int[] solution(String msg) {
        HashMap<String,Integer>map=new HashMap<>();
        char c='A';
        int cnt=27;
        for(int i=1; i<=26; i++){
            map.put(String.valueOf(c++),i);
        }
        String s1[]=msg.split("");
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0; i<s1.length-1; i++){


            if(map.containsKey(s1[i]) && !map.containsKey(s1[i]+s1[i+1])){
                map.put(s1[i]+s1[i+1],cnt++);
                ans.add(map.get(s1[i]));
            }
            else if(map.containsKey(s1[i]) && map.containsKey(s1[i]+s1[i+1])){
                s1[i+1]=s1[i]+s1[i+1];
            }
        }
        ans.add(map.get(s1[s1.length-1]));
        int answer[]=new int[ans.size()];
        for(int i=0; i<answer.length; i++){
            answer[i]=ans.get(i);
        }
        return answer;
    }
}
