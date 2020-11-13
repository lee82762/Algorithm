package 해시.위장;

import java.util.ArrayList;
import java.util.HashMap;
class Solution {
    public int solution(String[][] phone_book) {
        int answer = 1;
        HashMap<String, Integer> map=new HashMap<>();

        for(int i=0; i<phone_book.length; i++){
            map.put(phone_book[i][1], map.getOrDefault(phone_book[i][1], 0)+1);
        }
        System.out.println(map);
        ArrayList<String>key=new ArrayList<>(map.keySet());
        for(String key1:key){
            answer*=(map.get(key1)+1);
        }

        return answer-1;
    }
}