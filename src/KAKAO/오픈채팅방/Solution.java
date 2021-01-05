package KAKAO.오픈채팅방;

import java.util.ArrayList;
import java.util.HashMap;
class Solution {
    public String[] solution(String[] record) {
        HashMap<String , String >map=new HashMap<>();
        ArrayList<String>ans=new ArrayList<>();

        for(int i=0; i<record.length; i++){
            String s[]=record[i].split(" ");
            if(s[0].equals("Enter")){
                map.put(s[1],s[2]);
            }
            else if(s[0].equals("Change")){
                map.put(s[1],s[2]);
            }
            else{
                continue;
            }
        }
        for(int i=0; i<record.length; i++){
            String s1[]=record[i].split(" ");
            if(s1[0].equals("Enter")){
                String s2=map.get(s1[1])+"님이 들어왔습니다.";
                ans.add(s2);
            }
            else if(s1[0].equals("Leave")){
                String s2=map.get(s1[1])+"님이 나갔습니다.";
                ans.add(s2);
            }
        }

        String []answer=new String[ans.size()];
        for(int i=0; i<ans.size(); i++){
            answer[i]=ans.get(i);
        }
        return answer;
    }
}