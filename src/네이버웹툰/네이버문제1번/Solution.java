package 네이버웹툰.네이버문제1번;

import java.util.ArrayList;
import java.util.HashMap;
class Solution {
    public int solution(String[] id_list, int k) {
        HashMap<String,Integer>map=new HashMap<>();
        ArrayList<String>check=new ArrayList<>();
        for(int i=0; i<id_list.length; i++){
            String s[]=id_list[i].split(" ");
            for(int j=0; j<s.length; j++){
                String id=s[j];
                if(!check.contains(id)) {
                    check.add(id);
                }
                else{
                    continue;
                }
                if(!map.containsKey(id)){
                    map.put(id,map.getOrDefault(id,0)+1);
                }
                else if(map.get(id)<k){
                    map.put(id,map.getOrDefault(id,0)+1);
                }
            }
            check.clear();
        }
        ArrayList<String>answer=new ArrayList<>(map.keySet());
        int result=0;
        for(int i=0; i<answer.size(); i++){
            result+=map.get(answer.get(i));
        }
        return result;
    }
}
