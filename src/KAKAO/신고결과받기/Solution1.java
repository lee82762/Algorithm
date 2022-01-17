package KAKAO.신고결과받기;

import java.util.*;
class Solution1 {
    public int[] solution(String[] id_list, String[] report, int K) {
        HashMap<String, HashSet<String>> map =new HashMap<>();
        HashMap<String,Integer> map1 = new HashMap<>();

        for(String id : id_list){
            map1.put(id,0);
            map.put(id,new HashSet<>());
        }

        for(String rep : report){
            String temp[]=rep.split(" ");
            map.get(temp[1]).add(temp[0]);
        }

        for(String id : map.keySet()){
            HashSet<String> set = map.get(id);
            if(set.size()>=K){
                for(String mem : set){
                    map1.put(mem, map1.getOrDefault(mem,0)+1);
                }
            }
        }


        int answer[]=new int[map1.size()];
        for(int i=0; i<id_list.length; i++){
            answer[i]=map1.get(id_list[i]);
        }

        return answer;
    }
}
