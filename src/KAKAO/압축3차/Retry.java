package KAKAO.압축3차;

import java.util.ArrayList;
import java.util.HashMap;
class Retry {
    public int[] solution(String msg) {
        HashMap<String,Integer>map=new HashMap<>();
        char c='A';
        int cnt=1;
        //알파벳 순서대로 넣어주기
        for(cnt=1; cnt<=26; cnt++){
            map.put(String.valueOf(c),cnt);
            c++;
        }
        ArrayList<Integer>ans=new ArrayList<>();
        String s1[]=msg.split("");
        for(int i=0; i<s1.length-1; i++){
            //i번째 문자가 map에 포함되어있고, i번째 문자와 i+1번째 문자를 더한것이 map에 없으면
            if(map.containsKey(s1[i])&&!map.containsKey(s1[i]+s1[i+1])){
                map.put(s1[i]+s1[i+1],cnt++);
                ans.add(map.get(s1[i]));
            }
            //i번째 문자가 map에 포함되어있고, i번째 문자와 i+1번째 문자를 더한것이 map에 있으면
            else if(map.containsKey(s1[i])&&map.containsKey(s1[i]+s1[i+1])){
                s1[i+1]=s1[i]+s1[i+1];
            }
        }
        ans.add(map.get(s1[s1.length-1]));
        int answer[]=new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            answer[i]=ans.get(i);
        }

        return answer;
    }
}
