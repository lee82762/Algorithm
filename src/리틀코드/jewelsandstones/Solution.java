package 리틀코드.jewelsandstones;

import java.util.*;
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer> map =new HashMap<>();
        for(int i=0; i<jewels.length(); i++){
            char c=jewels.charAt(i);
            map.put(c,0);
        }

        for(int i=0; i<stones.length(); i++){
            char c=stones.charAt(i);
            if(map.get(c)!=null){
                map.put(c,map.getOrDefault(c,0)+1);
            }
        }
        ArrayList<Character> tm = new ArrayList<>(map.keySet());
        int answer=0;
        for(int i=0; i<tm.size(); i++){
            answer+=map.get(tm.get(i));
        }
        return answer;

    }
}
