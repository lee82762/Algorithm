package KAKAO.압축3차;

import java.util.ArrayList;
import java.util.HashMap;

class Last {
    public int[] solution(String msg) {
        char c='A';
        int i=0;
        HashMap<String,Integer>map=new HashMap<>();
        for(i=0; i<26; i++){
            map.put(String.valueOf((char)(c+i)),i+1);
        }
        ArrayList<Integer>ans=new ArrayList<>();
        String msgs[]=msg.split("");
        for(int k=0; k<msgs.length-1; k++){
            if(map.containsKey(msgs[k]) && !map.containsKey(msgs[k]+msgs[k+1])){
                map.put(msgs[k]+msgs[k+1],++i);
                ans.add(map.get(msgs[k]));
            }
            else{
                msgs[k+1]=msgs[k]+msgs[k+1];
            }
        }
        ans.add(map.get(msgs[msgs.length-1]));
        int answer[]=new int[ans.size()];
        for(int j=0; j<ans.size(); j++){
            answer[j]=ans.get(j);
        }
        return answer;
    }
}
