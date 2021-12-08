package KAKAO.오픈채팅방;

import java.util.ArrayList;
import java.util.HashMap;
class Retry {
    public String[] solution(String[] record) {
        HashMap<String,String>map=new HashMap<>();
        for(int i=0; i<record.length; i++){
            String s[]=record[i].split(" ");
            if(s[0].equals("Enter")){
                map.put(s[1],s[2]);
            }
            else if(s[0].equals("Change")){
                map.put(s[1],s[2]);
            }
        }
        ArrayList<String>ans=new ArrayList<>();
        for(int i=0; i<record.length; i++){
            String s[]=record[i].split(" ");
            if(s[0].equals("Enter")){
                ans.add(map.get(s[1])+"님이 들어왔습니다.");
            }
            else if(s[0].equals("Leave")){
                ans.add(map.get(s[1])+"님이 나갔습니다.");
            }
        }
        String[] answer = ans.toArray(new String[ans.size()]);

        return answer;
    }
}
